package com.jeho.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.jeho.customer.domain.Customer;
import com.jeho.customer.repository.CustomerRepository;

/**
 * CustomerService Implementation
 *
 * @author jeho.han
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findById(final Long customerId) {
		Optional<Customer> optional = customerRepository.findById(customerId);
		return optional.get(); 
	}

	@Override
	public List<Customer> findAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(final Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Boolean isCustomerExist(final Customer customer) {
		if (customer.getId() != null) {
			Optional<Customer> optional = customerRepository.findById(customer.getId());
			final Customer existingCustomer = optional.get();
			if (existingCustomer == null) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public Customer updateCustomer(final Long id, final Customer customer) {
		Optional<Customer> optional = customerRepository.findById(id);
		final Customer fetchedCustomer = optional.get();
		if (fetchedCustomer == null) {
			return null;
		}
		fetchedCustomer.setFirstname(customer.getFirstname());
		fetchedCustomer.setLastname(customer.getLastname());
		
		customerRepository.save(fetchedCustomer);
		
		return fetchedCustomer;
	}

	@Override
	public Customer patchCustomer(Long id, Customer customer) {
		Optional<Customer> optional = customerRepository.findById(id);
		final Customer fetchedCustomer = optional.get();
		if (fetchedCustomer == null) {
			return null;
		}
		
		if (customer.getFirstname() != null) {
			fetchedCustomer.setFirstname(customer.getFirstname());
		}
		
		if (customer.getLastname() != null) {
			fetchedCustomer.setLastname(customer.getLastname());
		}
		
		customerRepository.save(fetchedCustomer);
		
		return fetchedCustomer;
	}

	@Override
	public Boolean deleteCustomer(final Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		final Customer fetchedCustomer = optional.get();
		if (fetchedCustomer == null) {
			return false;
		} else {
			customerRepository.delete(fetchedCustomer);
			return true;
		}
	}

}
