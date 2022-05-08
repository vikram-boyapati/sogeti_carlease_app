package com.carlease.leaserate.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Gets the details.
 *
 * @return the details
 */
@Getter

/**
 * Instantiates a new error details.
 *
 * @param timestamp the timestamp
 * @param message   the message
 * @param details   the details
 */
@AllArgsConstructor
public class ErrorDetails {

	/** The timestamp. */
	private final Date timestamp;

	/** The message. */
	private final String message;

	/** The details. */
	private final String details;
}
