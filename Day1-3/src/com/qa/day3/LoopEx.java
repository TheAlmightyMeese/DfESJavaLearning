package com.qa.day3;

import java.util.Random;

public class LoopEx {


	public static void Spending() {
		
		int Wallet = 300;
		
		while (Wallet > 87) {
			Wallet -= 45;
			if (Wallet < 87) 
				System.out.println("You're spending too much money!");
				System.out.println(Wallet);
		}
	
	}
	
	public static void RandSpend() {
		int Wallet = 300;
		while (Wallet > 87) {
			Wallet -= new Random().nextInt(60);
			if (Wallet < 87) 
				System.out.println("You're spending too much money!");
				System.out.println(Wallet);
		}
	}
	
	public static void RandDefSpend(int Wallet, int maxspend) {
				while (Wallet > maxspend) {
			Wallet -= new Random().nextInt(100);
							}
				System.out.println("You're spending too much money!");
				System.out.println(Wallet);
		}
	
	
	
	public static void DoLoopSpend() {
		int Wallet = 300;
		do {
			Wallet -= new Random().nextInt(60);
			System.out.println("Current Value: " + Wallet);
		} 
		while (Wallet < 387);
		
			
			 
		System.out.println("You're spending too much money!");
				System.out.println(Wallet);
		
	}
}
	
