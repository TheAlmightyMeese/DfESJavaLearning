package com.qa.main;

public class Arrays {

	
		
	public static int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static int[] EditList = {1,1,1,1,1,1,1,1,1,1};
	
	
	public static void ArrayX2() {
		
		for ( int i = 0; i < numList.length; i++) {
			System.out.println(numList[i] * 2);
	}
}
	
	
	public static void ArraySquared() {
	
		for ( int i = 0; i < numList.length; i++) {
			System.out.println(numList[i] * numList[i]);
	}
	}

	public static void ArrayReplace() {
		for (int i = 0; i < EditList.length; i++) {
			 EditList[i] = numList[i] * numList[i];
			 System.out.println(EditList[i]);
		}
	}
	
		
	
}
