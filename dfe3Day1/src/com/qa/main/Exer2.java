package com.qa.main;

public class Exer2 {
	public static void main(String[] args) {
	
		boolean myBool = false;
		byte myByte = 3;
		char myChar = 'r';
		short myShort = 0; 
		int myInt = 1;
		long myLong = 1l;
		float myFloat = 5.0f;
		double myDouble = 1.0d;
		
		System.out.println( "H" + (myByte) + myInt + myDouble + 
				" W" + myShort + myChar + myLong + "d " + myFloat +
				" " + myBool);
	//	H3LL0 W0.000000r1d 5.0 false
}
}