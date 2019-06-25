package com.cg.flightreservationsystem.dto;

public class RouteDTO {
	private String routeId;
	private String sourceCity;
	private String destinationCity;
	public RouteDTO(String routeId, String sourceCity, String destinationCity) {
		super();
		this.routeId = routeId;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	
	@Override
	public String toString() {
		return "routeId=" + routeId + ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity;
}
}