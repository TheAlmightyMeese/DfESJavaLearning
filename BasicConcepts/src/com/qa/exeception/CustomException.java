package com.qa.exeception;



public class CustomException extends Exception {


	private static final long serialVersionUID = -504645056084138228L;

	public CustomException(String errorMessage) {
		super(errorMessage);
	}
	
	public CustomException(String errorMessage, Throwable err) {
			super(errorMessage,err);
	}
}