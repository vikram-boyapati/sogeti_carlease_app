package com.carlease.leaserate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The Class LeaseRateApplication.
 */
@SpringBootApplication
@EnableEurekaClient
public class LeaseRateApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(LeaseRateApplication.class, args);
	}
}
