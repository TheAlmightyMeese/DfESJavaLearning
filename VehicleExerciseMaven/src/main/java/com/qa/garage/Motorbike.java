package com.qa.garage;


public class Motorbike extends Vehicle {
	
	private Boolean needFullLicence;
	private int speed0To60;
	
	
	public Motorbike(String make, int engineSize, boolean petrol, String colour, Boolean needFullLicence,
			int speed0To60) {
		super(make, engineSize, petrol, colour);
		this.needFullLicence = needFullLicence;
		this.speed0To60 = speed0To60;
	}
	public Boolean getNeedFullLicence() {
		return needFullLicence;
	}
	public void setNeedFullLicence(Boolean needFullLicence) {
		this.needFullLicence = needFullLicence;
	}
	public int getSpeed0To60() {
		return speed0To60;
	}
	public void setSpeed0To60(int speed0To60) {
		this.speed0To60 = speed0To60;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " Motorbike Full Licence Needed: " + needFullLicence + ", Acceleration(0-60): " + speed0To60;
	}
	
	
	
}	
	
	
	