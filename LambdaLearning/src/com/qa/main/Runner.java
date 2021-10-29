package com.qa.main;

import com.qa.Lambda.Calc;

public class Runner {

	public static void main(String[] args) {
		
	Calc test = new Calc();
		System.out.println(test.add(2,2));
	System.out.println(test.method(test.add(3, 3),test.add(3, 3),Calc.add));
	}
}
