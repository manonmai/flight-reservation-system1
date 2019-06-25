package com.cg.flightreservationsystem.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.flightreservationsystem.exception.DateInvalidException;
import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.cg.flightreservationsystem.exception.TimeInvalidException;
import com.flightreservationsystem.utility.Validation;

public class FlightScheduleOperationsImplTest {
	/**
	 * creates object for validation class
	 */
	private Validation validate= new Validation();
	/**
	 * Checks if id format is correct
	 * @throws IdInvalidException
	 * @throws NullValueException
	 */
	@Test
	public void checkScheduleId() throws IdInvalidException, NullValueException
	{
		final boolean actual = validate.isScheduleIdValid("sc101");
		assertTrue(actual);
	}
	/**
	 * checks exception for wrong id format
	 * @throws IdInvalidException
	 * @throws NullValueException
	 */
	@Test(expected = IdInvalidException.class)
	public void checkIncorectId() throws IdInvalidException, NullValueException
	{
		validate.isScheduleIdValid("scs10156");
	}
	/**
	 * checks exception for wrong date format
	 * @throws DateInvalidException
	 * @throws NullValueException
	 */
	@Test
	public void checkDate() throws DateInvalidException, NullValueException
	{
		final boolean actual = validate.isDateValid("24-05-2019");
		assertTrue(actual);
	}
	/**
	 * checks if exception for wrong date format
	 * @throws DateInvalidException
	 * @throws NullValueException
	 */
	@Test(expected = DateInvalidException.class)
	public void checkIncorectDate() throws DateInvalidException, NullValueException
	{
		validate.isDateValid("30-02-2019");
	}
	/**
	 * checks if exception if value is empty
	 * @throws DateInvalidException
	 * @throws NullValueException
	 */
	@Test(expected = NullValueException.class)
	public void checkEmptyId() throws IdInvalidException, NullValueException 
	{
		validate.isScheduleIdValid("");
	}
	/**
	 * checks if time format is correct
	 * @throws TimeInvalidException
	 * @throws NullValueException
	 */
	@Test
	public void checkTime() throws TimeInvalidException, NullValueException
	{
		final boolean actual = validate.isTimevalid("12:50");
		assertTrue(actual);
	}
	

}
