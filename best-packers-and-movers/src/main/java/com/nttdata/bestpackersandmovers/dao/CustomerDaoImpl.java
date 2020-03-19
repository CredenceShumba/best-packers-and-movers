package com.nttdata.bestpackersandmovers.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nttdata.bestpackersandmovers.factory.CustomerFactory;
import com.nttdata.bestpackersandmovers.model.Customer;

/**
 * @author SHUMBC
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	private static List<Customer> customers = CustomerFactory.listOfCustomers();
	
	@Override
	public boolean createCustomer(Customer customer) {

		if (customer != null) {
			customers.add(customer);
			return true;
		} else {
			return false;
		}

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
		return customer;
	}

	/**
	 * returns a list of Customer objects
	 */
	@Override
	public List<Customer> retrieveAllCustomers() {

		return customers;
	}

	@Override
	public boolean deleteCustomer(Integer id) {
		
		boolean isDeleted = false;
		for(Customer customer: customers) {
			if(customer.getId() == id) {
				customers.remove(customer);
				isDeleted = true;
			}
		}
		return isDeleted;
	}

}
