package com.nttdata.bestpackersandmovers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bestpackersandmovers.dao.CustomerDao;
import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * @author SHUMBC
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerDao customerDao;

	@Override
	public boolean registerCustomer(Customer customer) {
		return customerDao.createCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Integer id) {
		return false;
	}

	/**
	 * returns a Customer object using the id param
	 * 
	 * @param id
	 */
	@Override
	public Customer getCustomer(Integer id) {

		return customerDao.retrieveCustomer(id);
	}

	/**
	 * returns a list of Customer objects
	 */
	@Override
	public List<Customer> getAllCustomers() {

		List<Customer> customers = customerDao.retrieveAllCustomers();
		return customers;
	}

	@Override
	public boolean deleteCustomer(Integer id) {

		return customerDao.deleteCustomer(id);
	}

}
