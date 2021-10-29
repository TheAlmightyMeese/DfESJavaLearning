package com.qa.main;

import com.qa.files.randomfiles;

public class Runner {

 public static void main(String[] args) {

	 System.out.println("I did a thing");
	
	 int roll = Integer.parseInt(args[0]);
	 int times = Integer.parseInt(args[1]);
	 randomfiles.roll(roll,times);
	 
	 
 	}
}
