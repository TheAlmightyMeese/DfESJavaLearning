package com.qa.Npc;

public class NPC {
	private String Name;
	private int HP;
	private String Job;
	private String Weapon;
	private String Armour;
	private boolean Living;
	
	
	public NPC(String Name,int HP, String Job, String Weapon, String Armour,boolean Living) {
		this.Name = Name;
		this.HP = HP;
		this.Job = Job;
		this.Weapon = Weapon;
		this.Armour = Armour;
		this.Living = Living;
	}
	
	
	
	
	public String getName() {	
		return Name;
	}




	public void setName(String name) {
		if (Name == "Fuck") {
			System.out.println("Please no swearing");
			return;		}	
			Name = name;
	}




	public int getHP() {
			return HP;
	}




	public void setHP(int hP) {
		HP = hP;
	}




	public String getJob() {
		return Job;
	}




	public void setJob(String job) {
		Job = job;
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




	public void statusCheck() {
		if (Living = true) {
		System.out.println("Still Alive");
		}
		else {
		System.out.println("Oh, they are dead");
		
		}
	
	}
	public NPC() {
		Name = "Dave";
		HP = 2;
		Job = "Commoner";
		Weapon = "Pitchfork";
		Armour = "None";
		Living = true;
	}
	
		
}	

