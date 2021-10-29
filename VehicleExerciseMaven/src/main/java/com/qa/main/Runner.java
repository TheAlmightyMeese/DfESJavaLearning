package com.qa.main;

import com.qa.garage.*;

public class Runner {
public static void main(String[] args) {
	
	Garage storage = new Garage();
	Car RT30GRT = new Car("BMW", 2000, true, "Black", 3, 160);
	Car LB60KUV = new Car("Peugeot", 2000, false, "Silver", 5, 120);
	Van HE23AVY = new Van("Ford" ,1800, false, "White", 10,12.5f);
	Motorbike GO21FST = new Motorbike("Kawasaki",1200, true, "Black",true,4);
	Car LL10WWB = new Car("Audi", 3000, true, "Red", 3, 190);
	
	
	
	
	storage.addVehicle(RT30GRT);
	storage.addVehicle(LB60KUV);
	storage.editVehicle(1, LL10WWB);
	storage.addVehicle(HE23AVY);
	storage.addVehicle(GO21FST);
	storage.checkGarage();
	storage.searchGarage(2);	
	RT30GRT.fixCost();

	
	if (RT30GRT.race() > LB60KUV.race()) {
		System.out.println(RT30GRT.getMake() + " has won the race!");
	}
		else {
			System.out.println(LB60KUV.getMake() + " has won the race!");
		}
	}
	
}