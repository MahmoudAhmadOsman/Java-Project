package author;

public class Calculate {

	// 1. first create variables
	String ItemName;
	String Author;
	double price;
	String ISBN;
	
	public Calculate() {
		//2.  TODO Auto-generated constructor stub
	
		ItemName = "Java Heros [Book Title]";
		Author = "Mahmoud Osman";
		price = 189.64;
		ISBN = "L58-G36-WS981";
		
	}

	public static void main(String[] args) {
		//3. instantiate for create new object
		
		Calculate BookDetails = new Calculate();
		System.out.println(BookDetails.ItemName);
		System.out.println("Author name is " + BookDetails.Author);
		System.out.println("Book price is: $" + BookDetails.price);
		System.out.println("Book ISBN Number is: " + BookDetails.ISBN);
		
		

	}

}
