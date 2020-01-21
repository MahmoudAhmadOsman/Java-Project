package packageAPI;
import java.util.Scanner;

public class PackageAPI {

	public static void main(String[] args) {
		Scanner askName = new Scanner(System.in);
	    String name;	
	    String age;
	
	 
	    System.out.println("Enter your name?"); 
	    name = askName.nextLine();  
	    System.out.println("Welcome, " + name + "!"); 

		// ask age
	    System.out.println("______________________________"); 
	    System.out.println("Enter your Age?"); 
	    age = askName.nextLine();  
	    System.out.println("Your are  " + age + " years old!"); 
	    System.out.println("______________________________"); 
	    
	    System.out.println("Well Done...!"); 

	}

}
