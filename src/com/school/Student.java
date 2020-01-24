package com.school;

public class Student extends Person {

	private double gpa;
	private int gradYear;

	public Student(String firstName, String lastName, String phone, String address, double gpa, int gradYear) {
		super(firstName, lastName, phone, address);
		this.gpa = gpa;
		this.gradYear = gradYear;
	}

	public void print() {
		System.out.println("Student Details ");
		System.out.println("__________________________________________ ");
		super.print();

		// Now print the additional arguments which are in GPA, gradYear in this case
		System.out.println("Student GPA is: " + gpa);
		System.out.println("Graduation year is: " + gradYear);
	}

}
