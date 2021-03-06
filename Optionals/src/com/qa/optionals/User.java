package com.qa.optionals;

import java.util.Optional;

public class User{
	private long id;
	private String firstName;
	private String lastName;
	private String eMail;
	private Long phoneNumber;
	

	
	public User(long id, String firstName, String lastName, String eMail, Long phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String geteMail() {
		return eMail;
	}



	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	public Long getPhoneNumber() throws Exception {
//		Optional<Long> Number = Optional.of(phoneNumber);	
//		if (phoneNumber == 0) { 
//		Number.orElse("Phone Number Not Provided").toString();
//		}
//		else;
		return Optional.ofNullable(phoneNumber).orElseThrow(() -> new Exception("Phone Number Not Provided"));
	}




	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	
	
}
