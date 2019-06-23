package com.cg.flightreservationsystem.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public class Routedb {
	List <RouteDTO> routeList = new ArrayList<RouteDTO>();
	public void add()
	{
		routeList.add(new RouteDTO("ro101", "Mumbai", "Pune"));
		routeList.add(new RouteDTO("ro102", "Mumbai", "Delhi"));
		routeList.add(new RouteDTO("ro101", "Pune", "Mumbai"));
		routeList.add(new RouteDTO("ro101", "Pune", "Delhi"));
		routeList.add(new RouteDTO("ro101", "Delhi", "Pune"));
		routeList.add(new RouteDTO("ro101", "Delhi", "Mumbai"));
	}
	public List<RouteDTO> getRouteList() {
		return routeList;
	}
	public void setRouteList(List<RouteDTO> routeList) {
		this.routeList = routeList;
	}
	public List<RouteDTO> view() throws EmptyListException {
		if(!routeList.isEmpty())
		{
		return routeList;
		}
		else
		{
			throw new EmptyListException("List is empty");
		}
	

}

}
