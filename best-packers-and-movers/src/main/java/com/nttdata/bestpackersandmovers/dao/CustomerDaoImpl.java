package com.nttdata.bestpackersandmovers.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nttdata.bestpackersandmovers.factory.CustomerFactory;
import com.nttdata.bestpackersandmovers.model.Customer;
import com.nttdata.bestpackersandmovers.util.LoggerUtil;

/**
 * Data access object class implements CustomerDao interface
 * 
 * @author SHUMBC
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	//used to log method calls into the console
	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

	private static List<Customer> customers = CustomerFactory.listOfCustomers();

	/**
	 * adds a new object to the list passed using the object param
	 * 
	 * @param customer
	 */
	@Override
	public boolean createCustomer(Customer customer) {

		if (customer != null) {
			customers.add(customer);
			logger.info("Customer added to the list");
			return true;
		} else {
			logger.info("Failed to add customer to the list: createCustomer()");
			return false;
		}
	}

	/**
	 * returns a Customer object from the customers list
	 * 
	 * @param id
	 */
	@Override
	public Customer retrieveCustomer(Integer id) {

		Customer customer = new Customer();

		for (Customer cust : customers) {
			if (cust.getId() == id) {
				customer.setId(id);
				customer.setUsername(cust.getUsername());
				customer.setFirstName(cust.getFirstName());
				customer.setLastName(cust.getLastName());
				customer.setEmail(cust.getEmail());
				customer.setUserType(cust.getUserType());
				customer.setPassword(cust.getPassword());
				customer.setAddress(cust.getAddress());
			}
		}
		logger.info("A GET call retrieved a customer: retrieveCustomer()");
		LoggerUtil.createPdf("C:\\Users\\SHUMBC\\ThatLocation\\Log.pdf", customer.getLastName());
		return customer;
	}

	/**
	 * Assigns new values passed using the object param and the id param
	 * 
	 * @param id
	 * @param customer
	 */
	@Override
	public boolean updateCustomer(Integer id, Customer customer) {

		boolean isUpdated = false;

		for (Customer cust : customers) {
			if (cust.getId() == id) {
				customer.setId(id);
				cust.setUsername(customer.getUsername());
				cust.setFirstName(customer.getFirstName());
				cust.setLastName(customer.getLastName());
				cust.setEmail(customer.getEmail());
				cust.setUserType(customer.getUserType());
				cust.setPassword(customer.getPassword());
				cust.setAddress(customer.getAddress());
				logger.info("Customer @id" + id + " is updated in the list");
				isUpdated = true;
			}
		}
		logger.info("Update done : updateCustomer.isUpdated = " + isUpdated);
		return isUpdated;
	}

	/**
	 * removes the object from customers list using the id
	 * 
	 * @param id
	 */
	@Override
	public boolean deleteCustomer(Integer id) {

		boolean isDeleted = false;

		for (Customer customer : customers) {
			if (customer.getId() == id) {
				customers.remove(customer);
				logger.info("Customer @id" + id + " is deleted from the list");
				isDeleted = true;
			}
		}
		logger.info("Delete done : deleteCustomer.isDeleted = " + isDeleted);
		return isDeleted;
	}

	/**
	 * returns a list of Customer objects
	 */
	@Override
	public List<Customer> retrieveAllCustomers() {
		logger.info("A GET call retrieved all customers: retrieveAllCustomers()");
		return customers;
	}

}
