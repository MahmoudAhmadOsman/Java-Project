package com.oop.ClassObject;

public class HistoryBook {
	
	
//Class Attributes
	String title = "Lost Nation";
	String author = "James Aweky";
	int publishedYear = 1945;
	double price = 38.68;

	public static void main(String[] args) {

		
	// Now create a class object
		HistoryBook bookName =  new HistoryBook();
		HistoryBook book2 = new HistoryBook();
		HistoryBook book3 = new HistoryBook();
		
		System.out.println("The book title is: " + bookName.title + ".");
		System.out.println("The author of the " 
		        + bookName.title + " is " 
				+ bookName.author + "."
				+ "\n The book was published in " 
				+ bookName.publishedYear + "."
				+ "\n The book price is " + "$" 
				+ bookName.price + "US dollars.");
		
/*
 * ============= Book 2 Section ==========
 */
		System.out.println("______________________________________");
		System.out.println("______________Book 2__________________");
		
		//Book Two
		
			book2.title = "Wars Fought In 1812";
			book2.author = "Abdel Raouf";
			book2.publishedYear = 1942;
			book2.price = 83.47;
			
		System.out.println("The title of book 2 is => " + book2.title + ".\n"
				+ "The author of book 2 is " + book2.author + ". \n"
				+  "The year that " + book2.title + " book is published was " + book2.publishedYear + ".\n"
				+ "The price of " + book2.title + " is $" + book2.price + " US dollars." );
		
		
	System.out.println("______________________________________");
	System.out.println("______________Book 3__________________");
		
		//Book Three
		
		book3.title = "Mature World";
		book3.author = "Wii Hiegi";
		book2.publishedYear = 1992;
		book3.price = 187.36;
		System.out.println("The title of book 3 is => " + book3.title + ".\n"
				+ "The author of book 2 is " + book3.author + ". \n"
				+  "The year that " + book3.title + " book is published was " + book3.publishedYear + ".\n"
				+ "The price of " + book2.title + " is $" + book3.price + " US dollars." );
		
		
	}

}
