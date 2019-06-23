package com.cg.flightreservationsystem.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public class Flightdb {
	List <FlightDTO> flightList = new ArrayList<FlightDTO>();
	public void add()
	{
		flightList.add(new FlightDTO("fa101",100));
		flightList.add(new FlightDTO("fa102",150));
		flightList.add(new FlightDTO("fa103",150));
		flightList.add(new FlightDTO("fa104",200));
		flightList.add(new FlightDTO("fa105",100));
		flightList.add(new FlightDTO("fa106",150));
		flightList.add(new FlightDTO("fa107",200));
		flightList.add(new FlightDTO("fa108",200));
		
	}
	public List<FlightDTO> view() throws EmptyListException {
		if(!flightList.isEmpty())
		{
		return flightList;
		}
		else
		{
			throw new EmptyListException("List is empty");
		}
	

}
}