package com.cg.flightreservationsystem.dto;

public class FlightDTO {
	private String flightId;
	private String capacity;
	
	public FlightDTO(String flightId, String capacity) {
		super();
		this.flightId = flightId;
		this.capacity = capacity;
	}
	public String getFlightId() {
		return flightId;
	}
	
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "flightId=" + flightId + ", capacity=" + capacity;
	}

}
