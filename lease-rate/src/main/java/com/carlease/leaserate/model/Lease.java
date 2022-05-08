package com.carlease.leaserate.model;

import javax.validation.constraints.Min;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Holds Lease details.
 */
@ApiModel(value = "Lease Rate model")
public class Lease {

	/** The mileage. */
	@Min(value = 1L, message = "Please provide valid mileage of car")
	@ApiModelProperty(value = "Amount of kilometers on annual base")
	private long mileage;

	/** The duration. */
	@Min(value = 1, message = "Please provide valid Number of months in the contract for car lease")
	@ApiModelProperty(value = "Number of months in the contract")
	private int duration;

	/** The interest rate. */
	@ApiModelProperty(value = "Interest rate as input")
	private Double interestRate;

	/** The net price. */
	@ApiModelProperty(value = "NET price as input")
	private Double netPrice;

	/**
	 * Instantiates a new lease.
	 */
	public Lease() {
	}

	/**
	 * Instantiates a new lease.
	 *
	 * @param mileage      the mileage
	 * @param duration     the duration
	 * @param interestRate the interest rate
	 * @param netPrice     the net price
	 */
	public Lease(long mileage, int duration, Double interestRate, Double netPrice) {
		this.mileage = mileage;
		this.duration = duration;
		this.interestRate = interestRate;
		this.netPrice = netPrice;
	}

	/**
	 * Gets the mileage.
	 *
	 * @return the mileage
	 */
	public long getMileage() {
		return mileage;
	}

	/**
	 * Sets the mileage.
	 *
	 * @param mileage the new mileage
	 */
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Gets the interest rate.
	 *
	 * @return the interest rate
	 */
	public Double getInterestRate() {
		return interestRate;
	}

	/**
	 * Sets the interest rate.
	 *
	 * @param interestRate the new interest rate
	 */
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Gets the net price.
	 *
	 * @return the net price
	 */
	public Double getNetPrice() {
		return netPrice;
	}

	/**
	 * Sets the net price.
	 *
	 * @param netPrice the new net price
	 */
	public void setNetPrice(Double netPrice) {
		this.netPrice = netPrice;
	}
}
