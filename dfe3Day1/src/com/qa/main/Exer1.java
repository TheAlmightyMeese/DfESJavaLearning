package com.qa.main;

public class Exer1 {
	    public static void main(String[] args) {
	        boolean amIHappy = false; // A boolean names amIHAppy is being delcared and assigned false
	        int weight = 20; // An Object forced as an integer is being decalred as 20
	        String name = "Billy Bob"; // An Object forced as a string is being declared as "Billy Bob"
	        Dog goodBoy = new Dog(name, weight);  // Creates a new instance of Dog Class called goodboy including the attributes name and weight
	        int x = weight - 10; // New Variable x = 10 less than weight 
	        if (x < 15) goodBoy.bark(); // If statement to establish if x is less than 15 then run imported function goodboy.bark = woof
	        while (x < 3) { // while loop if x is less than 3 run imported function Goodboy.play = i am playing
	            goodBoy.play();
	        }
	        int[] numList = {1,2,3,4,5,6}; // makes a list of integers
	        System.out.println("How are you"); // prints How are you
	        System.out.println("My " + name + " is doing great" 
	                + " how's yours"); //prints My "name" is doing great how's yours
	        String num = "305";  // sets an string object called num which is 305
	        int z = Integer.parseInt(num); // Integer object "z" = "num" converted into a integer

}
}