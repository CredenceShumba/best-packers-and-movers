package com.nttdata.bestpackersandmovers.dao;

import java.util.List;

import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * Data access object interface for the CRUD operation of the Customer class
 * @author SHUMBC
 *
 */
public interface CustomerDao {
	
	boolean createCustomer(Customer customer);
	
	Customer retrieveCustomer(Integer id);
	
	boolean updateCustomer(Integer id, Customer customer);
	
	boolean deleteCustomer(Integer id);
	
	List<Customer> retrieveAllCustomers();

}
