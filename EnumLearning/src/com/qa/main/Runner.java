package com.qa.main;

import com.qa.enumlist.Dealer;

public class Runner {
public static void main(String[] args) {
	
	Dealer bob = new Dealer();
	
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(bob.draw());
	}
	
}
}
