package com.nttdata.bestpackersandmovers.service;

import java.util.List;

import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * Customer service interface 
 * @author SHUMBC
 *
 */
public interface CustomerService {

	boolean registerCustomer(Customer customer);

	Customer getCustomer(Integer id);

	boolean updateCustomer(Integer id, Customer customer);

	boolean deleteCustomer(Integer id);

	List<Customer> getAllCustomers();

}
