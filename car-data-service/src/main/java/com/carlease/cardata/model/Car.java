package com.carlease.cardata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** This is CAR model to hold it's information. */
@Entity
@Table(name = "car")
@ApiModel(value = "Car entity class")
public class Car {

	/** The id. */
	@ApiModelProperty(value = "ID of car")
	private long id;

	/** The make. */
	@ApiModelProperty(value = "Maker of car")
	private String make;

	/** The model. */
	@ApiModelProperty(value = "Model of car")
	private String model;

	/** The version. */
	@ApiModelProperty(value = "Version of car")
	private String version;

	/** The number of doors. */
	@ApiModelProperty(value = "Number of doors for car")
	private int numberOfDoors;

	/** The emmission CO 2. */
	@ApiModelProperty(value = "CO2 emission from car")
	private double emmissionCO2;

	/** The gross price. */
	@ApiModelProperty(value = "Gross price of car")
	private double grossPrice;

	/** The net price. */
	@ApiModelProperty(value = "Net price of car")
	private double netPrice;

	/**
	 * Instantiates a new car.
	 */
	public Car() {
	}

	/**
	 * Instantiates a new car.
	 *
	 * @param id            the id
	 * @param make          the make
	 * @param model         the model
	 * @param version       the version
	 * @param numberOfDoors the number of doors
	 * @param emmissionCO2  the emmission CO 2
	 * @param grossPrice    the gross price
	 * @param netPrice      the net price
	 */
	public Car(long id, String make, String model, String version, int numberOfDoors, double emmissionCO2,
			double grossPrice, double netPrice) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.version = version;
		this.numberOfDoors = numberOfDoors;
		this.emmissionCO2 = emmissionCO2;
		this.grossPrice = grossPrice;
		this.netPrice = netPrice;
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
	 * Gets the make.
	 *
	 * @return the make
	 */
	@Column(name = "make", nullable = false)
	public String getMake() {
		return make;
	}

	/**
	 * Sets the make.
	 *
	 * @param make the new make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	@Column(name = "model", nullable = false)
	public String getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	@Column(name = "version", nullable = false)
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the number of doors.
	 *
	 * @return the number of doors
	 */
	@Column(name = "numberOfDoors", nullable = false)
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * Sets the number of doors.
	 *
	 * @param numberOfDoors the new number of doors
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * Gets the emmission CO 2.
	 *
	 * @return the emmission CO 2
	 */
	@Column(name = "emmissionCO2", nullable = false)
	public double getEmmissionCO2() {
		return emmissionCO2;
	}

	/**
	 * Sets the emmission CO 2.
	 *
	 * @param emmissionCO2 the new emmission CO 2
	 */
	public void setEmmissionCO2(double emmissionCO2) {
		this.emmissionCO2 = emmissionCO2;
	}

	/**
	 * Gets the gross price.
	 *
	 * @return the gross price
	 */
	@Column(name = "grossPrice", nullable = false)
	public double getGrossPrice() {
		return grossPrice;
	}

	/**
	 * Sets the gross price.
	 *
	 * @param grossPrice the new gross price
	 */
	public void setGrossPrice(double grossPrice) {
		this.grossPrice = grossPrice;
	}

	/**
	 * Gets the net price.
	 *
	 * @return the net price
	 */
	@Column(name = "netPrice", nullable = false)
	public double getNetPrice() {
		return netPrice;
	}

	/**
	 * Sets the net price.
	 *
	 * @param netPrice the new net price
	 */
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", version=" + version + ", numberOfDoors="
				+ numberOfDoors + ", emmissionCO2=" + emmissionCO2 + ", grossPrice=" + grossPrice + ", netPrice="
				+ netPrice + "]";
	}
}
