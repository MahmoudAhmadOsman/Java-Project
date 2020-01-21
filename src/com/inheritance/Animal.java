package com.inheritance;

public class Animal {

	protected String animaltype = "Cow"; // Animal attribute

	public void sound() {

		System.out.println("baah");
	}

	class Cow extends Animal {
		private String cowName = "Lazy"; // Cow attribute

	}

	public static void main(String[] args) {

		// Create a Cow1 object
		Cow Cow1 = new Cow();

		// Call the sound() method
		Cow1.sound();

		System.out.println(Cow1.animaltype + " " + Cow1.cowName);

	}

}
