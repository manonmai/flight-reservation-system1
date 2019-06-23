package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public interface FlightRoute {

	public boolean modify(String routeId,String source, String destination, boolean sOption) throws EmptyListException;
	public  List<ScheduleDTO> view() throws EmptyListException;
}
