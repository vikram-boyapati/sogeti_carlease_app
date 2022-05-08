package com.carlease.leaserate.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carlease.leaserate.model.Lease;
import com.carlease.leaserate.service.LeaseRateService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class LeaseRateController.
 */
@RestController
@RequestMapping("/api/v1")
@Api(value = "This is lease rate controller")
public class LeaseRateController {

	/** The lease rate service. */
	@Autowired
	private LeaseRateService leaseRateService;

	/**
	 * To calculate lease rate of a car.
	 *
	 * @param lease the lease
	 * @return lease rate
	 */
	@PostMapping("/leaserate")
	@ApiOperation(value = "Calculates the lease rate")
	public String calculateLeaseRate(@Valid @RequestBody Lease lease) {
		return leaseRateService.calculateLeaseRate(lease);
	}

	/**
	 * Handle validation exceptions.
	 *
	 * @param ex the ex
	 * @return the map
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		var errors = new HashMap<String, String>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			var fieldName = ((FieldError) error).getField();
			var errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
