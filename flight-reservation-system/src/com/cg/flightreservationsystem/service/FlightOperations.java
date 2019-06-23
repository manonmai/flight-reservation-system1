package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public interface FlightOperations {
	public boolean modify(String routeId,String source, String destination, boolean sOption)throws EmptyListException;
	public List<RouteDTO> view()throws EmptyListException;
	

}
