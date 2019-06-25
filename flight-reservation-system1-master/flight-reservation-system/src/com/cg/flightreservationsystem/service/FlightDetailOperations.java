package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public interface FlightDetailOperations {
	public boolean modifyFlightDetails(String flightId, String capacity)throws EmptyListException;
	public List<FlightDTO> viewFlightDetails()throws EmptyListException;
	

}
