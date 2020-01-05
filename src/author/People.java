package author;

public class People {

	String name;
	String country;
	String city;
	String phone;
	
	
	
// this is Constructor class
	
	public People() {
		// Set the initial value for the class attribute 
		name      = "Mahmoud Osman";
		country   = "USA";
		city      = "Coon Rapids";
        phone       = "555-555-5555"; 
	}
	
	

	public static void main(String[] args) {
	
		// Create an object of class People (This will call the constructor)
		
		People Mahmoud = new People(); 
		// Print the value of the above variable
	    System.out.println("Hello Everyone. \n My name is " + 
				Mahmoud.name + ".\n" + " I am from " + 
			    Mahmoud.country + ".\n " + "I live in " +
				Mahmoud.city + ".\n My phone number is " +
			    Mahmoud.phone + "."); 

	}

}
