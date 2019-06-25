package com.cg.flightreservationsystem.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.flightreservationsystem.exception.CapacityInvalidException;
import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.flightreservationsystem.utility.Validation;

public class FlightDetailOperationsImplTest {
	Validation validate= new Validation();
	@Test(expected = NullValueException.class)
	public void checkEmptyId() throws IdInvalidException, NullValueException {
		validate.isFlightIdValid("");
	}


	@Test
	public void TestcheckFlightId() throws IdInvalidException, NullValueException
	{
		boolean actual = validate.isFlightIdValid("fa101");
		assertTrue(actual);
	}
	@Test(expected = IdInvalidException.class)
	public void checkIncorectFlightId() throws IdInvalidException, NullValueException 
	{
		validate.isFlightIdValid("fa10156");
	}
	@Test
	public void checkCapacity() throws CapacityInvalidException, NullValueException 
	{
		boolean actual = validate.isCapacityValid("100");
		assertTrue(actual);
	}
	@Test(expected = CapacityInvalidException.class)
	public void checkIncorectCapacity() throws CapacityInvalidException, NullValueException 
	{
		validate.isCapacityValid("0000");
	}
	
}
