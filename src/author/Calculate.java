package author;

public class Calculate {

	// 1. first create variables
	String ItemName;
	double price;
	String ISBN;
	
	public Calculate() {
		//2.  TODO Auto-generated constructor stub
		
		ItemName = "Java Heros [Book Title]";
		price = 189.64;
		ISBN = "L5488ge658874";
		
	}

	public static void main(String[] args) {
		//3. instantiate for create new object
		
		Calculate BookDetails = new Calculate();
		System.out.println(BookDetails.ItemName);
		
		System.out.println("Book price is: $" + BookDetails.price);
		System.out.println("ISBN Number is: " + BookDetails.ISBN);
		
		

	}

}
