package com.cg.flightreservationsystem.dto;

public class PassengerDTO {
	private String name;
	private String age;
	private String mobileNo;
	private String emailId;
	
	public PassengerDTO(String name, String age, String mobileNo, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.emailId = emailId;

	}

	public String getName() {
		return name;
	}



	public String getAge() {
		return age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}



	@Override
	public String toString() {
		return "Passenger :\n\tname=" + name + "\n\tage=" + age + "\n\tmobileNo=" + mobileNo + "\n\temailId=" + emailId;
	}
	
}
