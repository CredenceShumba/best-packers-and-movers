package com.nttdata.bestpackersandmovers.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nttdata.bestpackersandmovers.model.Address;
import com.nttdata.bestpackersandmovers.model.Customer;

@Repository
public class CustomerFactory {

	public static List<Customer> listOfCustomers() {

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer(1, "jonh", "john@email.com", "password", "customer", "John", "LastName",
				new Address("1010", "Main Street", "Metro City", "PO11 2CO", "Nowhere")));
		customers.add(new Customer(2, "peter", "peter@email.com", "password", "customer", "Peter", "LastName",
				new Address("1010", "Maybe Street", "Metro City", "PO13 3CO", "Nowhere")));
		customers.add(new Customer(3, "andrew", "andrew@email.com", "password", "customer", "Andrew", "LastName",
				new Address("1010", "Where Street", "Metro City", "PO12 4CO", "Nowhere")));
		customers.add(new Customer(4, "tom", "tom@email.com", "password", "customer", "Tom", "LastName",
				new Address("1010", "Here Street", "Metro City", "PO11 2CO", "Nowhere")));
		customers.add(new Customer(5, "barry", "barry@email.com", "password", "customer", "Barry", "LastName",
				new Address("1010", "There Street", "Metro City", "PO33 1CO", "Nowhere")));

		return customers;
	}

}