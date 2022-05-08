package com.carlease.cardata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The Class CarDataServiceApplication.
 */
@SpringBootApplication
@EnableEurekaClient
public class CarDataServiceApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CarDataServiceApplication.class, args);
	}
}
