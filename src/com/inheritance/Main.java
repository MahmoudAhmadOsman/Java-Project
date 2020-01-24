package com.inheritance;

public class Main {

	public static void main(String[] args) {

		Apple fName = new Apple();
		fName.foodName();

		Apple fType = new Apple();
		fType.foodType();
		Apple fColor = new Apple();
		fType.foodColor();

		System.out.println(fName.getName());
		System.out.println(fType.getFoodType());

		System.out.println(fColor.getFoodColor());

	}

}
