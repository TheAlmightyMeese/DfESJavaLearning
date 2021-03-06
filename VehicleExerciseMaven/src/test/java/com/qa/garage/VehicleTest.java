package com.qa.garage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

public Vehicle vehicle;
	
@Before
public void setup() {
	vehicle = new Vehicle("Test", 1, false, "Blank");
}


@Test
public void objectTest() {
	assertTrue(vehicle instanceof Vehicle);
		}
@Test
public void getMakeTest() {
	assertEquals("Match",vehicle.getMake(), "Test");
}
@Test
public void setMakeTest() {
	vehicle.setMake("Other");
	assertEquals("Match", "Other", vehicle.getMake());
}

@Test
public void getEngineSizeTest() {
	assertEquals("No Match",vehicle.getEngineSize(),1);	
}
@Test
public void setEngineSizeTest() {
	vehicle.setEngineSize(2);
	assertEquals("Match Error", vehicle.getEngineSize() , 2);
}
@Test
public void isPetrolTest() {
	assertEquals("No Match", vehicle.isPetrol(),false);	
}
@Test
public void setPetrol() {
	vehicle.setPetrol(true);
	assertEquals("Match Error", vehicle.isPetrol() , true);
}
@Test
public void getColourTest() {
	assertEquals("No Match",vehicle.getColour(),"Blank");	
}
@Test
public void setColourTest() {
	vehicle.setColour("Red");
	assertEquals("Match Error", vehicle.getColour() , "Red");
}

@Test
public void toStringTest() {
	assertEquals("Match Error", vehicle.toString(),"Vehicle Make: Test, Engine Size (CC): 1, Petrol?: false, Colour: Blank");	
}
@Test
public void fixCostTest() {
	assertEquals("Match Error", vehicle.fixCost(), 500);
}

}