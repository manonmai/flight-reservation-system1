package com.cg.flightreservationsystem.dto;
/**
 * DTO class to store ticket information
 * @author trainee
 *
 */
public class TicketDTO {
	private String pnrNo;
	public TicketDTO(String pnrNo) {
		super();
		this.pnrNo = pnrNo;
	}

	

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	@Override
	public String toString() {
		return "TicketDTO [pnrNo=" + pnrNo + "]";
	}
}
