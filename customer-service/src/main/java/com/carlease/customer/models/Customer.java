package com.carlease.customer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Class Customer.
 */
@Entity
@Table(name = "customer")
@ApiModel(value = "This is the Customer model")
/** Hold Customers information */
public class Customer {

	/** The id. */
	@ApiModelProperty(value = "Id of customer")
	private long id;

	/** The name. */
	@ApiModelProperty(value = "Name of customer")
	private String name;

	/** The street. */
	@ApiModelProperty(value = "Street from customer address")
	private String street;

	/** The house number. */
	@ApiModelProperty(value = "House number from customer address")
	private int houseNumber;

	/** The zip code. */
	@ApiModelProperty(value = "Zip code from customer address")
	private String zipCode;

	/** The place. */
	@ApiModelProperty(value = "Place from customer address")
	private String place;

	/** The email address. */
	@ApiModelProperty(value = "Email of customer")
	private String emailAddress;

	/** The phone number. */
	@ApiModelProperty(value = "Phone number of customer")
	private String phoneNumber;

	/**
	 * Instantiates a new customer.
	 */
	public Customer() {

	}

	/**
	 * Instantiates a new customer.
	 *
	 * @param id           the id
	 * @param name         the name
	 * @param street       the street
	 * @param houseNumber  the house number
	 * @param zipCode      the zip code
	 * @param place        the place
	 * @param emailAddress the email address
	 * @param phoneNumber  the phone number
	 */
	public Customer(long id, String name, String street, int houseNumber, String zipCode, String place,
			String emailAddress, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.place = place;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	@Column(name = "street", nullable = false)
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Gets the house number.
	 *
	 * @return the house number
	 */
	@Column(name = "houseNumber", nullable = false)
	public int getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Sets the house number.
	 *
	 * @param houseNumber the new house number
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	@Column(name = "zipCode", nullable = false)
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the zip code.
	 *
	 * @param zipCode the new zip code
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Gets the place.
	 *
	 * @return the place
	 */
	@Column(name = "place", nullable = false)
	public String getPlace() {
		return place;
	}

	/**
	 * Sets the place.
	 *
	 * @param place the new place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	@Column(name = "emailAddress", nullable = false)
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets the email address.
	 *
	 * @param emailAddress the new email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	@Column(name = "phoneNumber", nullable = false)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", zipCode=" + zipCode + ", place=" + place + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
