package com.cg.flightreservationsystem.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.cg.flightreservationsystem.exception.PlaceInvalidException;
import com.flightreservationsystem.utility.Validation;

public class FlightRouteOperationsImplTest
{
	/**
	 * creates object for validation class
	 */
	Validation validate= new Validation();
	@Test(expected = NullValueException.class)
	public void testCheckEmptyId() throws IdInvalidException, NullValueException
	{
		validate.isRouteIdValid("");
	}

	@Test
	public void testCheckRouteId() throws IdInvalidException, NullValueException 
	{
		boolean actual = validate.isRouteIdValid("ro101");
		assertTrue(actual);
	}
	@Test(expected = IdInvalidException.class)
	public void checkIncorectRouteId() throws IdInvalidException, NullValueException
	{
		validate.isRouteIdValid("scs10156");
	}
	@Test
	public void checkSource() throws PlaceInvalidException, NullValueException 
	{
		boolean actual = validate.isPlaceValid("Mumbai");
		assertTrue(actual);
	}
	@Test(expected = PlaceInvalidException.class)
	public void checkIncorectSource() throws PlaceInvalidException, NullValueException
	{
		validate.isPlaceValid("564mumbai45645");
	}
}
