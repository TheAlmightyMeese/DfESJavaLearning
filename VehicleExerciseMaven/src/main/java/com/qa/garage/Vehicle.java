package com.qa.garage;

public class Vehicle {
	private String make;
	private int engineSize;
	private boolean petrol;
	private String colour;
	
	
	// Constructor
	public Vehicle(String make, int engineSize, boolean petrol, String colour) {
		super();
		this.make = make;
		this.engineSize = engineSize;
		this.petrol = petrol;
		this.colour = colour;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}


	public boolean isPetrol() {
		return petrol;
	}


	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Vehicle Make: " + make + ", Engine Size (CC): " + engineSize + ", Petrol?: " + petrol + ", Colour: " + colour;
	}
	
	
	public int fixCost() {
		int cost;
	cost = (500 * getEngineSize());
			System.out.println(cost);
		return cost;
	}
	
	
}
