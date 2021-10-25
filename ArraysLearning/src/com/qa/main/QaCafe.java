package com.qa.main;

import java.util.ArrayList;

public class QaCafe {

//	public static ArrayList<String> productList = new ArrayList<>();
	
	public static ArrayList<String> currentOrders = new ArrayList<>();
	
	public static ArrayList<String> doneOrders = new ArrayList<>();

	public static void addOrder(String Product) {
		currentOrders.add(Product);
	}
	
	public static void checkOrderList() {
		for ( int i = 0; i < currentOrders.size(); i++) {
		System.out.println("Order Number: " + i + " " + currentOrders.get(i));
		}	
	}
	
	public static String orderSearch(int OrderNo) {
		System.out.println(currentOrders.get(OrderNo));
		return currentOrders.get(OrderNo);
		
	}
	
	public static void changeOrder(int OrderNo, String Update) {
			System.out.println(currentOrders.get(OrderNo) + " Will be changed to "+ Update);
			currentOrders.set(OrderNo, Update);
	}
		

	public static void completeOrder(int OrderNo) {
		doneOrders.add(currentOrders.get(OrderNo));
		System.out.println("Order: " + currentOrders.get(OrderNo) + " Complete! Moved to done Orders" );
		currentOrders.remove(OrderNo);
			}

	public static void checkDoneList() {
		for ( int i = 0; i < doneOrders.size(); i++) {
		System.out.println("Completed Order Number: " + i + " " + doneOrders.get(i));
		}	
	}

	public static void endOfDay() {
		doneOrders.clear();
		currentOrders.clear();
	}







}
