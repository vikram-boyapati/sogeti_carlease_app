package com.carlease.cardata.controller;

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

import com.carlease.cardata.exception.ResourceNotFoundException;
import com.carlease.cardata.model.Car;
import com.carlease.cardata.repository.CarRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * The Class CarController.
 */
@RestController
@RequestMapping("/api/v1")
@Api(value = "This is car controller")
public class CarController {

	/** The car repository. */
	@Autowired
	private CarRepository carRepository;

	/**
	 * To fetch all cars details.
	 *
	 * @return list of car with it's data
	 */
	@GetMapping("/cars")
	@ApiOperation(value = "Get all cars")
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	/**
	 * To get details of a specific car based on it's ID.
	 *
	 * @param carId the car id
	 * @return car's data
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/cars/{id}")
	@ApiOperation(value = "Get Car by id")
	public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carId) throws ResourceNotFoundException {
		var car = getCar(carId);
		return ResponseEntity.ok().body(car);
	}

	/**
	 * Gets the car.
	 *
	 * @param carId the car id
	 * @return the car
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	private Car getCar(Long carId) throws ResourceNotFoundException {
		return carRepository.findById(carId)
				.orElseThrow(() -> new ResourceNotFoundException("Car not found for this id :: " + carId));
	}

	/**
	 * To create entry of car's data.
	 *
	 * @param car the car
	 * @return car's data
	 */
	@PostMapping("/cars")
	@ApiOperation(value = "Save new Car")
	public Car createCar(@Valid @RequestBody Car car) {
		return carRepository.save(car);
	}

	/**
	 * To modify data of specific car.
	 *
	 * @param carId      the car id
	 * @param carDetails the car details
	 * @return car's data
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@PutMapping("/cars/{id}")
	@ApiOperation(value = "Update a Car")
	public ResponseEntity<Car> updateCar(@PathVariable(value = "id") Long carId, @Valid @RequestBody Car carDetails)
			throws ResourceNotFoundException {
		var car = getCar(carId);

		// TODO: refactor
		car.setMake(carDetails.getMake());
		car.setModel(carDetails.getModel());
		car.setVersion(carDetails.getVersion());
		car.setNumberOfDoors(carDetails.getNumberOfDoors());
		car.setEmmissionCO2(carDetails.getEmmissionCO2());
		car.setGrossPrice(carDetails.getGrossPrice());
		car.setNetPrice(carDetails.getNetPrice());

		final var updatedCar = carRepository.save(car);
		return ResponseEntity.ok(updatedCar);
	}

	/**
	 * To remove specific car details.
	 *
	 * @param carId the car id
	 * @return the map
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@DeleteMapping("/cars/{id}")
	@ApiOperation(value = "Delete a Car")
	public Map<String, Boolean> deleteCar(@PathVariable(value = "id") Long carId) throws ResourceNotFoundException {
		var car = getCar(carId);

		carRepository.delete(car);
		var response = new HashMap<String, Boolean>(1);
		// TODO: To handle fail case return
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
