package author;

public class People {

	String name;
	String country;
	String city;
	int age;
	
	
	
// this is Constructor class
	
	public People() {
		// Set the initial value for the class attribute 
		name      = "Mahmoud Osman";
		country   = "USA";
		city      = "Coon Rapids";
        age       = 35; 
	}
	
	

	public static void main(String[] args) {
	
		// Create an object of class People (This will call the constructor)
		
		People Mahmoud = new People(); 
		// Print the value of the above variable
	    System.out.println("My name is " + 
				Mahmoud.name + "." + "and I am from " + 
			    		Mahmoud.country + ". " + "I live in " +
				Mahmoud.city + " and I am " +
			    		Mahmoud.age + " years old!"); 

	}

}
