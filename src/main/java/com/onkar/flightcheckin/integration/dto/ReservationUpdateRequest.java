package com.onkar.flightcheckin.integration.dto;

public class ReservationUpdateRequest {
	
	private long id;
	private boolean checkedIn;
	private int numberOfBags;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean getCheckedIn() {
		return this.checkedIn;
	}
	public void setCheckedInFlag(boolean checkedInFlag) {
		this.checkedIn = checkedInFlag;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	
	

}
