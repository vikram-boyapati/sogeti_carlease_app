package com.carlease.customer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlease.customer.exception.ResourceNotFoundException;
import com.carlease.customer.models.Customer;
import com.carlease.customer.repository.CustomerRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class CustomerController.
 */
@RestController
@RequestMapping("/api/v1")
@Api(value = "This is Customer controller")
public class CustomerController {

	/** Customer ID key name. */
	public static final String ID = "id";

	/** The customer repository. */
	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * Gets the all customers.
	 *
	 * @return list of customers
	 */
	@GetMapping("/customers")
	@ApiOperation(value = "Fetch all customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	/**
	 * To fetch customer based on ID.
	 *
	 * @param customerId the customer id
	 * @return the customer by id
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/customers/{id}")
	@ApiOperation(value = "Get customer by id")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = ID) Long customerId)
			throws ResourceNotFoundException {
		var customer = getCustomer(customerId);
		return ResponseEntity.ok().body(customer);
	}

	/**
	 * To create new customer.
	 *
	 * @param customer the customer
	 * @return details of created customer
	 */
	@PostMapping("/customers")
	@ApiOperation(value = "Save new customer information")
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * To modify existings customer information.
	 *
	 * @param customerId      the customer id
	 * @param customerDetails the customer details
	 * @return details of updated customer
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@PutMapping("/customers/{id}")
	@ApiOperation(value = "Modify customer information")
	public ResponseEntity<Customer> updateCustomer(@PathVariable(value = ID) Long customerId,
			@Valid @RequestBody Customer customerDetails) throws ResourceNotFoundException {
		var customer = getCustomer(customerId);

		// TODO: refactor below
		customer.setName(customerDetails.getName());
		customer.setStreet(customerDetails.getStreet());
		customer.setHouseNumber(customerDetails.getHouseNumber());
		customer.setZipCode(customerDetails.getZipCode());
		customer.setPlace(customerDetails.getPlace());
		customer.setEmailAddress(customerDetails.getEmailAddress());
		customer.setPhoneNumber(customerDetails.getPhoneNumber());

		final var updatedCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updatedCustomer);
	}

	/**
	 * To remove customer.
	 *
	 * @param customerId the customer id
	 * @return deletion is successfully done or failed
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@DeleteMapping("/customers/{id}")
	@ApiOperation(value = "Remove customer information")
	public Map<String, Boolean> deleteCustomer(@PathVariable(value = ID) Long customerId)
			throws ResourceNotFoundException {
		var customer = getCustomer(customerId);

		customerRepository.delete(customer);

		var response = new HashMap<String, Boolean>(1);
		// TODO: Handle fail case response
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	/**
	 * Gets the customer.
	 *
	 * @param customerId the customer id
	 * @return the customer
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	private Customer getCustomer(Long customerId) throws ResourceNotFoundException {
		return customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));
	}
}
