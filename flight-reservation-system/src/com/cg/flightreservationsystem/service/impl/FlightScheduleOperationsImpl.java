package com.cg.flightreservationsystem.service.impl;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.staticdb.Scheduledb;

public class FlightScheduleOperationsImpl{
	public boolean modify(String scheduleId, String arrivalTime, String departureTime, String arrivalDate, String departureDate) throws EmptyListException
	{
		Scheduledb scheduledb = new Scheduledb();
		boolean flag;
		flag = false;
		scheduledb.add();
		if(!scheduledb.getScheduleList().isEmpty()) {
			for(ScheduleDTO schedule: scheduledb.getScheduleList())
			{
				if(schedule.getScheduleId()==scheduleId)
				{
					schedule.setArrivalDate(arrivalDate);
					schedule.setArrivalTime(arrivalTime);
					schedule.setDepartureDate(departureDate);
					schedule.setDepartureTime(departureTime);
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
		
	}
