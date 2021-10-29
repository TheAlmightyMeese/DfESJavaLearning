package com.qa.garage;

public class Car extends Vehicle{
	private int numDoors;
	private int topSpeed;
	

	public Car(String make, int engineSize, boolean petrol, String colour, int numOfDoors, int topSpeed) {
		super(make, engineSize, petrol, colour);
		this.numDoors = numOfDoors;
		this.topSpeed = topSpeed;
	}


	public int getNumDoors() {
		return numDoors;
	}


	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	@Override
	public String toString() {
		return super.toString() + " Car Number of Doors: " + numDoors + ", Top Speed: " + topSpeed;
	}
	
	public int race() {
		int speed;
	speed = (getTopSpeed());
			System.out.println(speed);
		return speed;
	}
}
