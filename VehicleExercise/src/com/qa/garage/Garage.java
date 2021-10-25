package com.qa.garage;

import java.util.ArrayList;


public class Garage {


	public ArrayList<Vehicle> garageList = new ArrayList<>(); 


	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
		System.out.println("Added to List");
	}

	public void editVehicle(int OrderNo, Vehicle vehicle) {
		garageList.set(OrderNo, vehicle);
	}
	
	
	public void checkGarage() {
		System.out.println("Current in the Garage is: ");
		for (int i = 0; i <garageList.size(); i++) {
			System.out.println("Storage Number: " + (i+1) + " : " + garageList.get(i));

		}
	}

	public Vehicle searchGarage(int storageNo) {
		System.out.println(garageList.get(storageNo));
		return garageList.get(storageNo);
	}
	
	
	public void scrapAll() {
		garageList.clear();
	}
	
}
