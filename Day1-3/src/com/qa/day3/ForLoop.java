package com.qa.day3;

public class ForLoop {

	public static void Flow1() {
		
			for (
					int A = 100;
					A <= 200;
					A++)
				System.out.println(A);
	}
	public static void Flow2() {
		for (
				int A = 100;
				A <= 200; A++)
				 if (A % 2 == 0) {
				System.out.println("-");
				 }
				 else {
					 System.out.println("*");
				 }
				 	}
	
	public static void Ex3() {
		for ( int i = 1; 
				i <= 10;
				i++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(y);
			}
		}
		}
		
	public static void Ex5() {
		for (int i = 1;
				i <= 10;
				i++) {
			for (int t = 1; t <= i; t++) {
			System.out.print(i);	
			}
		System.out.println("");
		}
	}
	
	
	
}
