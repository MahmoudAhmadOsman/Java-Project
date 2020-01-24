package com.school;

public class Professor extends Person {


	public Professor(String firstName, String lastName, String phone, String address) {
		super(firstName, lastName, phone, address);
		
	}
	
	
	// This overrides the print method that is in person
	public void print() {
		System.out.println("About Professor ");
		super.print();
	}

}
