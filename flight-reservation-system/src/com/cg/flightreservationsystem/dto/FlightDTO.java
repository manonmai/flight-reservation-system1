package com.cg.flightreservationsystem.dto;

public class FlightDTO {
	private String flightId;
	private int capacity;
	public FlightDTO(String flightId, int capacity) {
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "flightId=" + flightId + ", capacity=" + capacity;
	}

}
