package com.qa.Npc;

public class StoryNPC extends Character {

		private boolean plotCritical;
		private String role;
		private int killableatlevel;

//Constructor
		
		public StoryNPC(String name, String race, String weapon, String armour, boolean living, boolean plotCritical,
				String role, int killableatlevel) {
			super(name, race, weapon, armour, living);
			this.plotCritical = plotCritical;
			this.role = role;
			this.killableatlevel = killableatlevel;
		}
		
// Child Method		
	
		public void whatAmI() {
			System.out.println("I am a "+ role);
		}

		public boolean isPlotCritical() {
			return plotCritical;
		}

		public void setPlotCritical(boolean plotCritical) {
			this.plotCritical = plotCritical;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getKillableatlevel() {
			return killableatlevel;
		}

		public void setKillableatlevel(int killableatlevel) {
			this.killableatlevel = killableatlevel;
		}
		
	

		
	
}
