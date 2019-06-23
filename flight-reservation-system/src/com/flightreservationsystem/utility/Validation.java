package com.flightreservationsystem.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.flightreservationsystem.exception.DateInvalidException;
import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.PlaceInvalidException;
import com.cg.flightreservationsystem.exception.TimeInvalidException;

public class Validation {
	public boolean isFlightIdValid(String flightId) throws IdInvalidException
	{
		Pattern pattern = Pattern.compile("[f][a][0-9]{3}");
		Matcher match = pattern.matcher(flightId);
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		return true;
	}
	public boolean isScheduleIdValid(String scheduleId) throws IdInvalidException
	{
		Pattern pattern = Pattern.compile("[s][c][0-9]{3}");
		Matcher match = pattern.matcher(scheduleId);
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		return true;
	}
	public boolean isRouteIdValid(String routeId) throws IdInvalidException
	{
		Pattern pattern = Pattern.compile("[r][o][0-9]{3}");
		Matcher match = pattern.matcher(routeId);
		if(!match.matches())
		{
			throw new IdInvalidException("Entered id in wrong format");
		}
		return true;
	}
	public boolean isPlaceValis(String place) throws PlaceInvalidException
	{
		Pattern pattern = Pattern.compile("[a-zA-Z");
		Matcher match = pattern.matcher(place);
		if(!match.matches())
		{
			throw new PlaceInvalidException("Entered id in wrong format");
		}
		return true; 
	}
	public boolean isDateValid(String date) throws DateInvalidException
	{
		if(date==null || date.matches("\\d[0-3]{2}-\\d[0-2]{2}-\\d{4}"))
		{
			throw new DateInvalidException("Entered invalid date format");
		}
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			format.parse(date);
			return true;
		}
		catch(ParseException e) {
			throw new DateInvalidException("Entered invalid date format");
		}
	}
	public boolean isTimevalid(String time) throws TimeInvalidException
	{
		Pattern pattern = Pattern.compile("[01]?[0,9]|2[0,3]):[0-5][0-9]");
		Matcher match = pattern.matcher(time);
		if(!match.matches())
		{
			throw new TimeInvalidException("Entered id in wrong format");
		}
		return true; 
	}
	public boolean isCapacityValid(int capacity) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
