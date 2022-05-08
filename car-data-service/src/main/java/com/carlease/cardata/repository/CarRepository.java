package com.carlease.cardata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlease.cardata.model.Car;

/**
 * The Interface CarRepository.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
