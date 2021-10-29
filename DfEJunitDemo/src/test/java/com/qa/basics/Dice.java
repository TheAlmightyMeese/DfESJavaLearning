package com.qa.basics;

import java.util.Random;

public class Dice {

	// Task to make Dice
		public static int d4() {
			int roll = new Random().nextInt(4)+ 1;
				return roll;
		}
		public static int d3() {
			int roll = new Random().nextInt(3)+ 1;
				return roll;
	}
		public static int d6() {
			int roll = new Random().nextInt(6)+ 1;
				return roll;
		}
		public static int d8() {
			int roll = new Random().nextInt(8)+ 1;
				return roll;
		}
		public static int d10() {
			int roll = new Random().nextInt(10)+ 1;
				return roll;
		}
		public static int d12() {
			int roll = new Random().nextInt(12)+ 1;
				return roll;
		}
		public static int d20() {
			int roll = new Random().nextInt(20)+ 1;
				return roll;
		}
		// Task to add 4 rolls of a d6 together (I expanded to have an input as number of rolls)
		public static int AddrollsD6(int rolls) {
			int total = 0;
			while (rolls > 0) {
				int result = Dice.d6();
				total = total + result;
				rolls = rolls - 1;
			}
			return total;
		 }

	// Made a Dice Maker defined by the user not a part of the task	
		public static int RollXDY(int rolls, int sides) {
			int total = 0;
				while (rolls > 0) {
					int dice = new Random().nextInt(sides) + 1;
					total = total + dice;
					rolls = rolls -1; }
				return total;
		}
		
		// add 4d6
		public static int Add6() {
			int Res1 = Dice.d6();
			int Res2 = Dice.d6();
			int Res3 = Dice.d6();
			int Res4 = Dice.d6();
			int result = (Res1 + Res2 + Res3 + Res4);
			
			return result;
		}	
		// add 2d10 to 2d3
		public static int Add210and23() {
			int Res1 = Dice.d10();
			int Res2 = Dice.d10();
			int Res3 = Dice.d3();
			int Res4 = Dice.d3();
			int result = (Res1 + Res2 + Res3 + Res4);
			
			return result;
		}
		
		// add 1 of each dice in the exercise
		public static int AddEach() {
			int Res1 = Dice.d3();
			int Res2 = Dice.d4();
			int Res3 = Dice.d6();
			int Res4 = Dice.d8();
			int Res5 = Dice.d10();
			
			int result = (Res1 + Res2 + Res3 + Res4 + Res5);
			
			return result;
		}
}
