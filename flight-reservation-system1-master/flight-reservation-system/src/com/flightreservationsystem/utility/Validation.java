package com.flightreservationsystem.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.flightreservationsystem.exception.CapacityInvalidException;
import com.cg.flightreservationsystem.exception.DateInvalidException;
import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.cg.flightreservationsystem.exception.PlaceInvalidException;
import com.cg.flightreservationsystem.exception.PriceInvalidException;
import com.cg.flightreservationsystem.exception.TimeInvalidException;
/**
 * Validation class to validate the data entered by user
 * @author seeta
 *
 */
public class Validation {
	/**
	 * Checks if flight id format
	 * @param flightId
	 * @return boolean
	 * @throws IdInvalidException
	 * @throws NullValueException
	 */
	public boolean isFlightIdValid(String flightId) throws IdInvalidException, NullValueException
	{
		Pattern pattern = Pattern.compile("[f][a][0-9]{3}");
		Matcher match = pattern.matcher(flightId);
		if(flightId.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		return true;
	}
	/**
	 * checks if schedule id is valid or not
	 * @param scheduleId
	 * @return boolean
	 * @throws IdInvalidException
	 * @throws NullValueException
	 */
	
	public boolean isScheduleIdValid(String scheduleId) throws IdInvalidException, NullValueException
	{
		Pattern pattern = Pattern.compile("[s][c][0-9]{3}");
		Matcher match = pattern.matcher(scheduleId);
		if(scheduleId.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		
		return true;
	}
	/**
	 * Checks if route id is valid or not
	 * @param routeId
	 * @return boolean
	 * @throws IdInvalidException
	 * @throws NullValueException
	 */
	public boolean isRouteIdValid(String routeId) throws IdInvalidException, NullValueException
	{
		if(routeId.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		Pattern pattern = Pattern.compile("[r][o][0-9]{3}");
		Matcher match = pattern.matcher(routeId);
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		return true;
	}
	/**
	 * checks if place is valid or not
	 * @param place
	 * @return boolean
	 * @throws PlaceInvalidException
	 * @throws NullValueException
	 */
	public boolean isPlaceValid(String place) throws PlaceInvalidException, NullValueException
	{
		if(place.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]*");
		Matcher match = pattern.matcher(place);
		if(!match.matches())
		{
			throw new PlaceInvalidException("Entered place in wrong format");
		}
		return true; 
	}
	/**
	 * checks date format
	 * @param date
	 * @return boolean
	 * @throws DateInvalidException
	 * @throws NullValueException
	 */
	public boolean isDateValid(String date) throws DateInvalidException, NullValueException
	{
		if(date.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}

		if( date.matches("\\d[0-3]{2}-\\d[0-9]{2}-\\d{4}"))
		{
			return true;
		
		}
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		format.setLenient(false);
		try {
			format.parse(date);
			return true;
		}
		catch(ParseException e) {
			throw new DateInvalidException("Entered invalid date format");
		}
	}
	/**
	 * checks time format
	 * @param time
	 * @return boolean
	 * @throws TimeInvalidException
	 * @throws NullValueException
	 */
	public boolean isTimevalid(String time) throws TimeInvalidException, NullValueException
	{
		if(time.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		Pattern pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
		Matcher match = pattern.matcher(time);
		if(!match.matches())
		{
			throw new TimeInvalidException("Entered id in wrong format");
		}
		return true; 
	}
	/**
	 * checks capacity count
	 * @param capacity
	 * @return boolean
	 * @throws CapacityInvalidException
	 * @throws NullValueException
	 */
	public boolean isCapacityValid(String capacity) throws CapacityInvalidException, NullValueException {
		// TODO Auto-generated method stub
		if(capacity.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		Pattern pattern = Pattern.compile("[1-9][0-9][0-9]");
		Matcher match = pattern.matcher(capacity);
		if(!match.matches())
		{
			throw new CapacityInvalidException("Please enter correct capacity");
		}
		return true; 
	}
	/**
	 * checks price format
	 * @param price
	 * @return
	 * @throws PriceInvalidException
	 * @throws NullValueException
	 */
	public boolean isPricevalid(String price) throws PriceInvalidException, NullValueException {
		if(price.isEmpty())
		{
			throw new NullValueException("Value cannot be empty");
		}
		Pattern pattern = Pattern.compile("[1,9][0-9]{1,12}(\\.[0-9]+)?");
		Matcher match = pattern.matcher(price);
		if(!match.matches())
		{
			throw new PriceInvalidException("please enter the price correctly");
		}
		return true; 
	}
	
	

}
