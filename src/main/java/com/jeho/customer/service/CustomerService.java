package com.jeho.customer.service;

import java.util.List;

import com.jeho.customer.domain.Customer;


/**
 * CustomerService interface
 * 
 * @author jeho.han
 */
public interface CustomerService {

	/**
	 * To return a customer object fetched by ID
	 * 
	 * @param customerId customer ID
	 * @return Customer object
	 */
	Customer findById(Long customerId);
	
	/**
	 * @return the list of all customers
	 */
	List<Customer> findAllCustomers();
	
	/**
	 * @param customer Customer entity to be saved
	 */
	Customer saveCustomer(Customer customer);
	
	/**
	 * @param customer Customer entity to check existence
	 * @return true if exist; otherwise, return false
	 */
	Boolean isCustomerExist(Customer customer);
	
	/**
	 * @param id customer ID to be updated
	 * @param customer updated customer entity
	 * @return updated customer entity
	 */
	Customer updateCustomer(Long id, Customer customer);
	
	/**
	 * @param id customer ID to be updated
	 * @param customer updated customer entity
	 * @return patched customer entity
	 */
	Customer patchCustomer(Long id, Customer customer);
	
	/**
	 * @param id customer ID to be deleted
	 * @return true, if deleted; otherwise, return false
	 */
	Boolean deleteCustomer(Long id);
	
}
