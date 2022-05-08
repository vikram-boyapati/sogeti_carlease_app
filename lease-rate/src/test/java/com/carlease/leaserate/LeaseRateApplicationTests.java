package com.carlease.leaserate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carlease.leaserate.controller.LeaseRateController;

/**
 * The Class LeaseRateApplicationTests.
 */
@SpringBootTest(classes = LeaseRateApplication.class)
public class LeaseRateApplicationTests {

	/** The lease rate controller. */
	@Autowired
	LeaseRateController leaseRateController;

	/**
	 * Context loads.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void contextLoads() throws Exception {
		assertThat(leaseRateController).isNotNull();
	}
}
