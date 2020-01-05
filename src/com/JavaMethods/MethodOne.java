/**
 * 
 */
package com.JavaMethods;

/**
 * @author Mahmoud Osman
 *
 */
public class MethodOne {

	/**
	 * @param args
	 */
	
	
	// A method is a block of code which only runs when it is called. 
	// You can pass data to it or also known  parameters
	// Methods also know functions and they are reusable  in many different areas and times in your project.
	
	
	static void sampleMethod() {
		System.out.println("Sample method is here first!");
		System.out.println("________________________");
	}
	
	//let's create a method()
	
	static void computeNumber(int a, int b, int r) {
		
		System.out.println("The result of the second method is: " +  a + b * r);
		
	}
	
	
	
	public static void main(String[] args) {
		//sample method is called here
		sampleMethod();
		
		// Now call the second method
		computeNumber(50, 15, 85);
	}

}
