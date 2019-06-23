package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;

import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;

import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.staticdb.Flightdb;


public class FlightDetailOperationsImpl {
	static Flightdb flightdb = new Flightdb();
	public boolean modify(String flightId, int capacity) throws EmptyListException {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
		flightdb.add();
		if(!flightdb.getFlightList().isEmpty()) {
			for(FlightDTO flight: flightdb.getFlightList())
			{
				if(flight.getFlightId()==flightId)
				{
					flight.setCapacity(capacity);
					break;
				}
			}
		}
			else
			{
				throw new EmptyListException("List is Empty");
			}
		return flag;
	}

	public static List<FlightDTO> view() throws EmptyListException {
		// TODO Auto-generated method stub
		flightdb.add();
		if(!flightdb.getFlightList().isEmpty())
		{
		List<FlightDTO>flightList = new ArrayList<FlightDTO>();
		flightList.addAll(flightdb.view());
		return flightList;
		}
		else {
			throw new EmptyListException("List is empty");
		}
	}

}
