package com.qa.main;

import com.qa.optionals.User;
 
public class Runner {
	public static void main(String[] args) throws Exception {
		
	
	User Bob = new User(1,"Bob", "Bobson", "Bob@Bob", null);
	
System.out.println(Bob.getPhoneNumber());

	
}
}