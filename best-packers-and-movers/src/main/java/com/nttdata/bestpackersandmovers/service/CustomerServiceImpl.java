package com.nttdata.bestpackersandmovers.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bestpackersandmovers.dao.CustomerDao;
import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * Class implements the Customer service interface
 * 
 * @author SHUMBC
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	// used to log method calls into the console
	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerDao customerDao;

	@Override
	public boolean registerCustomer(Customer customer) {
		logger.info("CustomerService.registerCustomer() called");
		return customerDao.createCustomer(customer);
	}

	@Override
	public Customer getCustomer(Integer id) {
		logger.info("CustomerService.getCustomer() called");
		return customerDao.retrieveCustomer(id);
	}

	@Override
	public boolean updateCustomer(Integer id, Customer customer) {
		logger.info("CustomerService.updateCustomer() called");
		return customerDao.updateCustomer(id, customer);
	}

	@Override
	public boolean deleteCustomer(Integer id) {
		logger.info("CustomerService.deleteCustomer() called");
		return customerDao.deleteCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		logger.info("CustomerService.getAllCustomers() called");
		return customerDao.retrieveAllCustomers();
	}

}
