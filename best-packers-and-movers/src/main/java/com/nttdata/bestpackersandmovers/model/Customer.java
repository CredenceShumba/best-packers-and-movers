package com.nttdata.bestpackersandmovers.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Customer class 
 * @author SHUMBC
 *
 */
public class Customer {

	private Integer id;
	@NotNull(message = "Username cannot be null")
	@Size(min = 1, message = "Enter a valid username")
	private String username;
	@NotNull(message = "Email cannot be null")
	@Size(min = 8, message = "Enter a valid email")
	private String email;
	@NotNull(message = "Password cannot be null")
	@Size(min = 8, message = "Enter a valid password, 8 char long")
	private String password;
	@NotNull(message = "User type cannot be null")
	@Size(min = 1, message = "Enter a valid user type")
	private String userType;
	@NotNull(message = "First name cannot be null")
	@Size(min = 1, message = "Enter a valid first name")
	private String firstName;
	@NotNull(message = "Last name cannot be null")
	@Size(min = 1, message = "Enter a valid last name")
	private String lastName;
	@NotNull(message = "Address cannot be null")
	private Address address;

	public Customer() {
		super();
	}
	
	public Customer(@NotNull(message = "Username cannot be null") @Size(min = 1, message = "Enter a valid username") String username,
			@NotNull(message = "Email cannot be null") @Size(min = 8, message = "Enter a valid email") String email,
			@NotNull(message = "Password cannot be null") @Size(min = 8, message = "Enter a valid password, 8 char long") String password,
			@NotNull(message = "User type cannot be null") @Size(min = 1, message = "Enter a valid user type") String userType,
			@NotNull(message = "First name cannot be null") @Size(min = 1, message = "Enter a valid first name") String firstName,
			@NotNull(message = "Last name cannot be null") @Size(min = 1, message = "Enter a valid last name") String lastName,
			@NotNull(message = "Address cannot be null") Address address) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public Customer(Integer id,
			@NotNull(message = "Username cannot be null") @Size(min = 1, message = "Enter a valid username") String username,
			@NotNull(message = "Email cannot be null") @Size(min = 8, message = "Enter a valid email") String email,
			@NotNull(message = "Password cannot be null") @Size(min = 8, message = "Enter a valid password, 8 char long") String password,
			@NotNull(message = "User type cannot be null") @Size(min = 1, message = "Enter a valid user type") String userType,
			@NotNull(message = "First name cannot be null") @Size(min = 1, message = "Enter a valid first name") String firstName,
			@NotNull(message = "Last name cannot be null") @Size(min = 1, message = "Enter a valid last name") String lastName,
			@NotNull(message = "Address cannot be null") Address address) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", userType=" + userType + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
