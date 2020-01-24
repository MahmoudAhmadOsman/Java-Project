package com.school;

public class Person {
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Person(String firstName, String lastName, String phone, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	public void print() {
		System.out.println(firstName + " " + lastName + " " + phone + " " + address);
	}

}
