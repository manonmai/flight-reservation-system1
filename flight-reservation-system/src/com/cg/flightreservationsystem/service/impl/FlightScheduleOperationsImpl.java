package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

import com.cg.flightreservationsystem.staticdb.Scheduledb;

public class FlightScheduleOperationsImpl{
	static Scheduledb scheduledb = new Scheduledb();
	public boolean modify(String scheduleId, String arrivalTime, String departureTime, String arrivalDate, String departureDate,String option, String price) throws EmptyListException
	{
		
		boolean flag;
		flag = false;
		scheduledb.add();
		if(option=="arrivalTime")
		{
		if(!scheduledb.getScheduleList().isEmpty()) {
			for(ScheduleDTO schedule: scheduledb.getScheduleList())
			{
				if(schedule.getScheduleId()==scheduleId)
				{
					schedule.setArrivalTime(arrivalTime);
					break;
				}
			}
		}
			else
			{
				throw new EmptyListException("List is Empty");
			}
		}
		else if(option=="departureTime")
		{
			if(!scheduledb.getScheduleList().isEmpty()) {
				for(ScheduleDTO schedule: scheduledb.getScheduleList())
				{
					if(schedule.getScheduleId()==scheduleId)
					{
						schedule.setDepartureTime(departureTime);
						break;
					}
				}
			}
				else
				{
					throw new EmptyListException("List is Empty");
				}
		}
		else if(option=="departureDate")
		{
			if(!scheduledb.getScheduleList().isEmpty()) {
				for(ScheduleDTO schedule: scheduledb.getScheduleList())
				{
					if(schedule.getScheduleId()==scheduleId)
					{
						schedule.setDepartureDate(departureDate);
						break;
					}
				}
			}
				else
				{
					throw new EmptyListException("List is Empty");
				}
		}
		else if(option=="arrivalDate")
		{
			if(!scheduledb.getScheduleList().isEmpty()) {
				for(ScheduleDTO schedule: scheduledb.getScheduleList())
				{
					if(schedule.getScheduleId()==scheduleId)
					{
						schedule.setArrivalDate(arrivalDate);
						break;
					}
				}
			}
				else
				{
					throw new EmptyListException("List is Empty");
				}
		}
		else if(option == "price")
		{
			if(!scheduledb.getScheduleList().isEmpty()) {
				for(ScheduleDTO schedule: scheduledb.getScheduleList())
				{
					if(schedule.getScheduleId()==scheduleId)
					{
						schedule.setPrice(price);
						break;
					}
				}
			}
				else
				{
					throw new EmptyListException("List is Empty");
				}
		}
		return flag;
		}
	public static List<ScheduleDTO> view() throws EmptyListException {
		// TODO Auto-generated method stub
		scheduledb.add();
		if(!scheduledb.getScheduleList().isEmpty())
		{
		List<ScheduleDTO>scheduleList = new ArrayList<ScheduleDTO>();
		scheduleList.addAll(scheduledb.view());
		return scheduleList;
		}
		else {
			throw new EmptyListException("List is empty");
		}
	}


		
	}
