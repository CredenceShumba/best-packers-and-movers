package com.nttdata.bestpackersandmovers.service;

import java.util.List;

import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * @author SHUMBC
 *
 */
public interface CustomerService {
	
	boolean registerCustomer(Customer customer);
	
	boolean updateCustomer(Integer id);
	
	Customer getCustomer(Integer id);
	
	List<Customer> getAllCustomers();
	
	boolean deleteCustomer(Integer id);

}
