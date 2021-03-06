package com.qa.garage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	public Car testCar;
	
	@Before
	public void setup() {
	testCar = new Car("Test", 1, false, "Blank", 1, 1);
	}
	
	@Test
	public void carClassTest() {
		assertTrue(testCar instanceof Car);
	}
	
	@Test
	
	public void getNumDoorsTest() {
		assertEquals("Match Error",testCar.getNumDoors(),1);
	}
	@Test
	public void setNumDoorsTest() {
		testCar.setNumDoors(2);
		assertEquals("Match Error",testCar.getNumDoors(),2);
	}
	
	@Test
	
	public void getTopSpeedTest() {
		assertEquals("Match Error",testCar.getTopSpeed(),1);
	}
	@Test
	public void setTopSpeedTest() {
		testCar.setTopSpeed(2);
		assertEquals("Match Error",testCar.getTopSpeed(),2);
	}

	@Test
	public void toStringTest() {
		assertEquals("Match Error", testCar.toString(),"Vehicle Make: Test, Engine Size (CC): 1, Petrol?: false, Colour: Blank Car Number of Doors: 1, Top Speed: 1");	
	}
	
	@Test
	public void raceTest() {
		assertEquals("Match Error", testCar.race(), 1);
	}
}



