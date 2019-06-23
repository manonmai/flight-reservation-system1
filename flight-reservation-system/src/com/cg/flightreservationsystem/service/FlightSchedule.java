package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public interface FlightSchedule {
	public boolean modify(String scheduleId, String arrivalTime, String departureTime, String arrivalDate, String departureDate,String option, String price) throws EmptyListException;
	public List<ScheduleDTO> view() throws EmptyListException;
}
