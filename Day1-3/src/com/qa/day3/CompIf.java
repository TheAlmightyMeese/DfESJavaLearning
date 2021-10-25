package com.qa.day3;

public class CompIf {

		public static int blackJack(int card1, int card2) {
			if (card1 > card2 && card1 <= 21) {
				return card1;
				}
				else if (card2 > card1 && card2 <= 21) {
					return card2;					
				}
				else if (card1 <= 21 && card1 < card2) {
					return card1;
				}
				else if (card2 <= 21 && card2 < card1) {
					return card2;
				}
				else {
					return 0;
				}
		}
		
		public static int sumPls (int num1, int num2, int num3) {
	
			if (num1 == num2 && num1 != num3) {
				int result = num3; 
				return result;
			}
			else if (num1 == num3 && num1 != num2) {
				int result = num2;
				return result;
			}
			else if (num2 == num3 && num2 != num1) {
				int result = num1;
				return result;
			}
			else if (num1 == num2 && num1 == num3) {
				return 0;
			}
			else {
				 int result = (num1 + num2 + num3);
					return result;
			}
		}
		
		public static String fizzBuzz(int number){
		if (number % 15 == 0) {
				return "FizzBuzz";
			}
		else if (number % 5 == 0) {
				return "Buzz";	
			}
		else if (number % 3 == 0) {
					return "Fizz";
			}
		else {
			return String.valueOf(number);
			}
		}
		
		public static int taxBacket(int Salary) {
			if (Salary > 14999) {
				return 0;
			}
			else if (Salary >= 15000 && Salary < 19999) {
				return 10;
			}
			else if (Salary >= 20000 && Salary < 29999) {
				return 15;
			}
			else if (Salary >= 30000 && Salary < 44999) {
				return 20;
			}
			else {
				return 25;
			}
		}
		
}
		
		
		
		


