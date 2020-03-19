package com.nttdata.bestpackersandmovers.dao;

import java.util.List;

import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * @author SHUMBC
 *
 */
public interface CustomerDao {

	boolean createCustomer(Customer customer);

	boolean updateCustomer(Integer id);

	Customer retrieveCustomer(Integer id);

	List<Customer> retrieveAllCustomers();

	boolean deleteCustomer(Integer id);
}
