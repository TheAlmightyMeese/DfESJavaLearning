package com.qa.Npc;

public class Character {

		private String Name;
		private String Race;
		private String Weapon;
		private String Armour;
		private boolean Living;
		
		
		public Character(String name, String race, String weapon, String armour, boolean living) {
			super();
			Name = name;
			Race = race;
			Weapon = weapon;
			Armour = armour;
			Living = living;
			
		}
// Method
		
		public void statusCheck() {
			if (Living == true) {
			System.out.println("Still Alive");
			}
			else if (Living == false){
			System.out.println("Oh, they are dead");
				}
			}
		
// Getters and Setters
		public String getName() {
			return Name;
		}


		public void setName(String name) {
			Name = name;
		}


		public String getRace() {
			return Race;
		}


		public void setRace(String race) {
			Race = race;
		}


		public String getWeapon() {
			return Weapon;
		}


		public void setWeapon(String weapon) {
			Weapon = weapon;
		}


		public String getArmour() {
			return Armour;
		}


		public void setArmour(String armour) {
			Armour = armour;
		}


		public boolean isLiving() {
			return Living;
		}


		public void setLiving(boolean living) {
			Living = living;
		}
		
	
	}
	
