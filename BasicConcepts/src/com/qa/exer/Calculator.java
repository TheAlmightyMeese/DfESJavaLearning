package com.qa.exer;

import com.qa.exeception.CustomException;

public class Calculator {

	public static int calcAdd(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int calcMinus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int calcMulti(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static int calcDiv(int num1, int num2) {
		int result = 0; // creates result object
		try { // will try and do the block
			// if checks if 1 greater than 2 = throw error
			if (num1 < num2) {
				throw new CustomException("Please ensure the first number is greater than the second!");
			}
			result = num1 / num2; // if the if statement doesn't apply result = divide
		}
		catch (ArithmeticException e) { // finds Math Error 
			e.printStackTrace(); // Prints math Error
			System.out.println("Please don't Divide by Zero"); // adds line underneath the stacktrace to tell you off
		} catch (CustomException e) { // flags custom exception based on if statement
			e.printStackTrace();// prints error
		} catch (Exception e) { // generic exception?
			e.printStackTrace();// prints stack trace
		}
		return result; // returns 0 if the if is triggered OR returns original divide if its ok
	}

	public static double calcpwr(double num1, double num2) {
		double result = Math.pow(num1, num2);
		return result;
	}
}
