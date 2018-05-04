package com.jeho.customer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.jeho.customer.domain.Customer;

/**
 * Repository for Customer entity
 * 
 * @author jeho.han
 */
@Repository
@XRayEnabled
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
