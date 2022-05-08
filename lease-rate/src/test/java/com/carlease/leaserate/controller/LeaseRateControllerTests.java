package com.carlease.leaserate.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.carlease.leaserate.model.Lease;
import com.carlease.leaserate.service.LeaseRateService;

/**
 * The Class LeaseRateControllerTests.
 */
@WebMvcTest(value = LeaseRateController.class)
public class LeaseRateControllerTests {

	/** The lease rate service. */
	@MockBean
	private LeaseRateService leaseRateService;

	/** The mock mvc. */
	@Autowired
	private MockMvc mockMvc;

	/**
	 * Context loads.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void contextLoads() throws Exception {
		assertThat(leaseRateService).isNotNull();
	}

	/**
	 * Calculate lease rate test.
	 *
	 * @throws Exception the exception
	 */
	public void calculateLeaseRateTest() throws Exception {
		var lease = new Lease();
		lease.setMileage(45000l);
		lease.setDuration(60);
		lease.setInterestRate(4.5);
		lease.setNetPrice(63000d);
		var leaseString = "{\"mileage\": \"45000\", \"duration\" : \"60\", \"interestRate\" : \"4.5\", \"netPrice\" : \"63000\"}";
		when(leaseRateService.calculateLeaseRate(lease)).thenReturn("239,82");

		mockMvc.perform(
				MockMvcRequestBuilders.post("/leaserate").content(leaseString).contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", Is.is("239,82")));
	}
}
