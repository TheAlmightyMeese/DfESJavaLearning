package com.qa.garage;



public class Van extends Vehicle {

		private int carryCap;
		private float sizeTonnes;
		
		
		public Van(String make, int engineSize, boolean petrol, String colour, int carryCap, float sizeTonnes) {
			super(make, engineSize, petrol, colour);
			this.carryCap = carryCap;
			this.sizeTonnes = sizeTonnes;
		}


		public int getCarryCap() {
			return carryCap;
		}


		public void setCarryCap(int carryCap) {
			this.carryCap = carryCap;
		}


		public float getSizeTonnes() {
			return sizeTonnes;
		}


		public void setSizeTonnes(float sizeTonnes) {
			this.sizeTonnes = sizeTonnes;
		}


		@Override
		public String toString() {
			return super.toString() + " Van " + "Carrying Capacity: " + carryCap + " Van Size: " + sizeTonnes;
		}
		
		
		
}
