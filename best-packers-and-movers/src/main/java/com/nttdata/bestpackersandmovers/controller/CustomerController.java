package com.nttdata.bestpackersandmovers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bestpackersandmovers.exception.CustomerNotFoundException;
import com.nttdata.bestpackersandmovers.model.Customer;
import com.nttdata.bestpackersandmovers.service.CustomerService;
import com.nttdata.bestpackersandmovers.util.LoggerUtil;

/**
 * @author SHUMBC
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Create a customer using POST method
	 * 
	 * @param customer
	 * @return Custom message and Http status code
	 */
	@PostMapping
	public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {

		if (customerService.registerCustomer(customer)) {
			LoggerUtil.logAction("Successful POST to create a customer REST call");
			return new ResponseEntity<String>("Customer registered successfully", HttpStatus.CREATED);
		} else {
			LoggerUtil.logAction("Failed POST to create a customer REST call");
			// #########will need a customer exception and response here
			return new ResponseEntity<String>("Customer registration failed", HttpStatus.I_AM_A_TEAPOT);
		}
	}

	/**
	 * Get a Customer object using the id param
	 * 
	 * @param id
	 * @return Customer found object or exception
	 */
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") Integer id) {

		LoggerUtil.logAction("GET a customer REST call");
		Customer customer = customerService.getCustomer(id);

		if (customer.getId() == null) {
			throw new CustomerNotFoundException(id);
		} else {
			return customer;
		}

	}

	/**
	 * Update a customer using the id param and the new object values
	 * 
	 * @param id
	 * @param customer
	 * @return Custom message and Http status code
	 */
	@PutMapping("/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable("id") Integer id, @RequestBody Customer customer) {

		if (customerService.updateCustomer(id, customer)) {
			LoggerUtil.logAction("Successful UPDATE a customer REST call");
			return new ResponseEntity<String>("Customer @id " + id + " updated successfully", HttpStatus.OK);
		} else {
			LoggerUtil.logAction("Failed UPDATE a customer REST call");
			return new ResponseEntity<String>("Customer update failed", HttpStatus.I_AM_A_TEAPOT);
		}
	}

	/**
	 * Delete a customer using the id param
	 * 
	 * @param id
	 * @return Custom message and Http status code
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") Integer id) {

		if (customerService.deleteCustomer(id)) {
			LoggerUtil.logAction("Successful DELETE a customer REST call");
			return new ResponseEntity<String>("Customer @id " + id + " deleted successfully", HttpStatus.OK);
		} else {
			LoggerUtil.logAction("Failed DELETE a customer REST call");
			return new ResponseEntity<String>("Customer delete failed", HttpStatus.I_AM_A_TEAPOT);
		}
	}

	/**
	 * Get all the customers
	 * 
	 * @return a list of Customers
	 */
	@GetMapping
	public List<Customer> getAllCustomers() {
		LoggerUtil.logAction("GET all customer REST call");
		return customerService.getAllCustomers();
	}

}
