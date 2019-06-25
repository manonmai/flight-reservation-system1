package com.cg.flightreservationsystem.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public class Scheduledb {
	private static List <ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();
	/**
	 * static block to add values 
	 */
	static
	{
		scheduleList.add(new ScheduleDTO("sc101", "04.25", "07.00", "25-01-2019", "25-01-2019","6000"));
		scheduleList.add(new ScheduleDTO("sc102", "08.25", "10.00", "25-01-2019", "25-01-2019","3500"));
		scheduleList.add(new ScheduleDTO("sc103", "10.00", "13.00", "25-01-2019", "25-01-2019","4500"));
		scheduleList.add(new ScheduleDTO("sc104", "06.25", "08.00", "25-01-2019", "25-01-2019","3544"));
		scheduleList.add(new ScheduleDTO("sc105", "04.25", "6.00", "25-01-2019", "25-01-2019","5600"));
		scheduleList.add(new ScheduleDTO("sc106", "23.25", "01.00", "25-01-2019", "26-01-1998","2500"));
		scheduleList.add(new ScheduleDTO("sc107", "11.25", "13.00", "25-01-2019", "25-01-2019","5500"));
		
	}
	public List<ScheduleDTO> view() throws EmptyListException {
		if(!getScheduleList().isEmpty())
		{
		return getScheduleList();
		}
		else
		{
			throw new EmptyListException("List is empty");
		} 
}
	public List <ScheduleDTO> getScheduleList() {
		return scheduleList;
	}
	public void setScheduleList(List <ScheduleDTO> scheduleList) {
		Scheduledb.scheduleList = scheduleList;
	}

}
