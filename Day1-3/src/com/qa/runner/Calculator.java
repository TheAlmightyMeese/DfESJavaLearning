package com.qa.runner;

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
		int result = num1 / num2;
		return result;
	}
	public static double calcpwr(double num1, double num2) {
		double result = Math.pow(num1, num2);
		return result;
	}
}

