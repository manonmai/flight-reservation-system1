package com.cg.flightreservationsystem.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;

public class Routedb {

	static List <RouteDTO> routeList = new ArrayList<RouteDTO>();
	/**
	 * static block to add values 
	 */
	static{
		routeList.add(new RouteDTO("ro101", "Mumbai", "Pune"));
		routeList.add(new RouteDTO("ro102", "Mumbai", "Delhi"));
		routeList.add(new RouteDTO("ro103", "Pune", "Mumbai"));
		routeList.add(new RouteDTO("ro104", "Pune", "Delhi"));
		routeList.add(new RouteDTO("ro105", "Delhi", "Pune"));
		routeList.add(new RouteDTO("ro106", "Delhi", "Mumbai"));
	}
	
	/**
	 * @return the routeList
	 */
	public  List<RouteDTO> getRouteList() {
		return routeList;
	}

	/**
	 * @param routeList the routeList to set
	 */
	public  void setRouteList(List<RouteDTO> routeList) {
		Routedb.routeList = routeList;
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
