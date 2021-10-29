package com.qa.main;

public class Turtle {
		String name = "Terry";
		int age = 45;
		boolean plastic = false;
		float length = 0.7f;
		boolean genderMale = true;
		
	
	
		public void size() {
			if (length > 0.8) {
				System.out.println( name + "is a smol tortle");
		} else {
			System.out.println( name + "is a long long tortle");
			}
		}
		
	

// Creates a class instance with user added variables		
		
public Turtle(String name, int age, boolean plastic, float length,	boolean gender) {
			this.name = name;
			this.age = age;
			this.genderMale = gender;
			this.length = length;
			this.plastic = plastic;	
}

	public void MorF () {
			if (genderMale == true) {
				System.out.println( name + " is a Male");}
			else if (genderMale == false) {
				System.out.println( name + " is a Female");}
			
		}
// needed to print the list info as a string if no toString it just prints memory code.
@Override
public String toString() {
	return "Turtle [name=" + name + ", age=" + age + ", plastic=" + plastic + ", length=" + length + ", genderMale="
			+ genderMale + "]";
}
}


