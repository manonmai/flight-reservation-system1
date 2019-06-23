package com.cg.flightreservationsystem.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public class Scheduledb {
	private List <ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();
	public void add()
	{
		getScheduleList().add(new ScheduleDTO("sc101", "04.25", "07.00", "25/01/2019", "25/01/2019","6000"));
		getScheduleList().add(new ScheduleDTO("sc101", "08.25", "10.00", "25/01/2019", "25/01/2019","3500"));
		getScheduleList().add(new ScheduleDTO("sc101", "10.00", "13.00", "25/01/2019", "25/01/2019","4500"));
		getScheduleList().add(new ScheduleDTO("sc101", "06.25", "08.00", "25/01/2019", "25/01/2019","3544"));
		getScheduleList().add(new ScheduleDTO("sc101", "04.25", "6.00", "25/01/2019", "25/01/2019","5600"));
		getScheduleList().add(new ScheduleDTO("sc101", "23.25", "01.00", "25/01/2019", "26/01/1998","2500"));
		getScheduleList().add(new ScheduleDTO("sc101", "11.25", "13.00", "25/01/2019", "25/01/2019","5500"));
		
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
		this.scheduleList = scheduleList;
	}

}
