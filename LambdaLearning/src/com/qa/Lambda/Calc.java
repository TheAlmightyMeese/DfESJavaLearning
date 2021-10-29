package com.qa.Lambda;

public class Calc {

interface func{
	int values(int x, int y);
}

public static func add = (int x, int y) -> x + y;
public static func sub = (int x, int y) -> x - y;
public static func div = (int x, int y) -> x / y;
public static func mul = (int x, int y) -> x * y;



public int method(int x, int y, func funcObj) {
	return funcObj.values(x,y);
}

public int add(int x, int y) {
	return add.values(x,y);
}
public int sub(int x, int y) {
	return sub.values(x,y);
}
public int div(int x, int y) {
	return div.values(x,y);
}
public int mul(int x, int y) {
	return mul.values(x,y);
}
 


}
