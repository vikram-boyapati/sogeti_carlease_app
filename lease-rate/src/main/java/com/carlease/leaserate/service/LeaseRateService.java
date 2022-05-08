package com.carlease.leaserate.service;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.carlease.leaserate.model.Lease;

/**
 * The Class LeaseRateService.
 */
@Service
public class LeaseRateService {

	/**
	 * To calculate lease rate of a car.
	 *
	 * @param lease the lease
	 * @return leaseRate
	 */
	public String calculateLeaseRate(Lease lease) {
		var leaseRate = (((lease.getMileage() / 12) * lease.getDuration()) / lease.getNetPrice())
				+ (((lease.getInterestRate() / 100) * lease.getNetPrice()) / 12);
		var formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		return formatter.format(leaseRate);
	}
}
