package com.qa.Npc;

public class Player extends Character  {
	
	private int level;
	private String jobClass;
	private boolean inTheParty;
	
//Constructor
	public Player(String name, String race, String weapon, String armour, boolean living, int level, String jobClass,
			boolean inTheParty) {
		super(name, race, weapon, armour, living);
		this.level = level;
		this.jobClass = jobClass;
		this.inTheParty = inTheParty;
	}
//Child Method
		public void didYouSplit() {
			if (inTheParty = true) {
				System.out.println("Stay Together, Stay Alive!");
			}
			else {
				System.out.println("Left at the Tavern");
			}
		}
		
// Getters Setters
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public String getJobClass() {
			return jobClass;
		}
		public void setJobClass(String jobClass) {
			this.jobClass = jobClass;
		}
		public boolean isInTheParty() {
			return inTheParty;
		}
		public void setInTheParty(boolean inTheParty) {
			this.inTheParty = inTheParty;
		}
	
		
		
		
		
	}
	
	


