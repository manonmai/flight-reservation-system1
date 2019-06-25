package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;

import java.util.List;


import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.service.FlightRouteOperations;
import com.cg.flightreservationsystem.staticdb.Routedb;

public class FlightRouteOperationsImpl implements FlightRouteOperations{
	 Routedb routedb = new Routedb();
	public boolean modifyRouteDetails(String routeId,String source, String destination, boolean sOption) throws EmptyListException
	{
	boolean flag;
	flag = false;
	List<RouteDTO>routeList = routedb.getRouteList();
	if(routeList==null||routeList.isEmpty())
	{
		throw new EmptyListException("Flight list is having issue");
	}else
	{
	if(sOption)
	{
		for(RouteDTO route:routeList )
		{
			if(route.getRouteId().equals(routeId))
			{
				route.setSourceCity(source);
				flag = true;
				break;
			}
		}
	}
	else
	{
			for(RouteDTO route:routeList)
			{
				if(route.getRouteId().equals(routeId))
				{
					route.setDestinationCity(destination);
					flag = true;
					break;
				}
			}
		}
	
	return flag;
	}
	}
	public List<RouteDTO> viewRouteDetails() throws EmptyListException {
		// TODO Auto-generated method stub
		
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