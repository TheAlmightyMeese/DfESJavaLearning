package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
	QaCafe.addOrder("Medium Americano");
	QaCafe.addOrder("Large Caramel Latte");
	QaCafe.checkOrderList();
	
	QaCafe.changeOrder(1, "Super Large Caramel Latte");
	
	
	QaCafe.checkOrderList();
	
	QaCafe.completeOrder(0);
	QaCafe.checkOrderList();
	QaCafe.checkDoneList();
	
	
	}
}
