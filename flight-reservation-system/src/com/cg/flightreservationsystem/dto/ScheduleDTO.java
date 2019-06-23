package com.cg.flightreservationsystem.dto;

public class ScheduleDTO {
	private String scheduleId;
	private String departureTime;
	private String arrivalTime;
	private String departureDate;
	private String arrivalDate;
	private String price;
	public ScheduleDTO(String scheduleId, String departureTime, String arrivalTime, String departureDate,
			String arrivalDate,String price) {
		super();
		this.scheduleId = scheduleId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.price=price;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	@Override
	public String toString() {
		return "scheduleId=" + scheduleId + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + ", price=" + price;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	

}
