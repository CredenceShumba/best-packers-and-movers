package com.nttdata.bestpackersandmovers.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bestpackersandmovers.model.Customer;
import com.nttdata.bestpackersandmovers.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/{id}")
	public Customer getCustomerDetails(@PathVariable("id") Integer id){
		return customerService.getCustomer(id);
	}

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PostMapping
	public ResponseEntity<UUID> registerCustomer(@RequestBody Customer customer) {

		//check if the object is null here 
		if (customerService.registerCustomer(customer) == true) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<UUID> deleteCustomer(@PathVariable("id") Integer id){
		customerService.deleteCustomer(id);
		return new ResponseEntity<>(HttpStatus.GONE);
	}
}
