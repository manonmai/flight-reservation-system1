package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;

import java.util.List;


import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.service.FlightOperations;
import com.cg.flightreservationsystem.staticdb.Routedb;

public class FlightRouteOperationsImpl implements FlightOperations{
	static Routedb routedb = new Routedb();
	public boolean modify(String routeId,String source, String destination, boolean sOption) throws EmptyListException
	{
	
	boolean flag;
	flag = false;
	routedb.add();
	if(sOption)
	{
	if(!routedb.getRouteList().isEmpty()) {
		for(RouteDTO route: routedb.getRouteList())
		{
			if(route.getRouteId()==routeId)
			{
				route.setSourceCity(source);
				flag = true;
				break;
			}
		}
	}
	else
		{
			throw new EmptyListException("List is Empty");
		}
	}
	else
	{
		if(!routedb.getRouteList().isEmpty()) {
			for(RouteDTO route: routedb.getRouteList())
			{
				if(route.getRouteId()==routeId)
				{
					route.setDestinationCity(destination);
					flag = true;
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

	public List<RouteDTO> view() throws EmptyListException {
		// TODO Auto-generated method stub
		routedb.add();
		if(!routedb.getRouteList().isEmpty())
		{
		List<RouteDTO>routeList = new ArrayList<RouteDTO>();
		routeList.addAll(routedb.view());
		return routeList;
		}
		else {
			throw new EmptyListException("List is empty");
		}
	}

	
	
}