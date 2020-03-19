package com.nttdata.bestpackersandmovers.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Address of a customer
 * @author SHUMBC
 *
 */
public class Address {

	@NotNull(message = "House number cannot be null")
	@Size(min = 1, message = "Enter a valid house number")
	private String houseNumber;
	private String streetName;
	@NotNull(message = "City cannot be null")
	@Size(min = 2, message = "Enter a valid city")
	private String city;
	@NotNull(message = "Postcode cannot be null")
	@Size(min = 7, message = "Enter a valid postcode")
	private String postcode;
	@NotNull(message = "Country cannot ne null")
	@Size(min = 4, message = "Enter a valid country name")
	private String country;

	public Address() {
		super();
	}

	public Address(
			@NotNull(message = "House number cannot be null") @Size(min = 1, message = "Enter a valid house number") String houseNumber,
			String streetName,
			@NotNull(message = "City cannot be null") @Size(min = 2, message = "Enter a valid city") String city,
			@NotNull(message = "Postcode cannot be null") @Size(min = 7, message = "Enter a valid postcode") String postcode,
			@NotNull(message = "Country cannot ne null") @Size(min = 4, message = "Enter a valid country name") String country) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", city=" + city + ", postcode="
				+ postcode + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}

}
