/**
 * 
 */
package com.JavaMethods;

/**
 * @author Mahmoud Osman Method Overloading
 */

//In method overloading, multiple methods can have the same name but  with different parameters

public class MethodOverloading {

	/**
	 * @param args
	 */

//Method One
	static int methodOne(int num1, int num2, int num3, int num4) {
		return num1 + num2 * num3 / num4;
	}

//This Method  - overloads method one
	static double methodOne(double num1, double num2, double num3, double num4) {
		return num1 + num2 * num3 / num4;
	}

	public static void main(String[] args) {
		// Call method one or function
		int callMethodone = methodOne(5, 5, 155, 12);
		System.out.println("The result is: " + callMethodone);

		// this - overrides method one because method one was int and now method one is
		// double data type
		double callMethodTwo = methodOne(16.65, 15.5, 120.2, 42.32);
		System.out.println("Method two results are: " + String.format("%.2f", callMethodTwo));

	}

}
