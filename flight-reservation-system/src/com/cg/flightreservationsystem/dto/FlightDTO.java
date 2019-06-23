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
	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", capacity=" + capacity + "]";
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
	

}
