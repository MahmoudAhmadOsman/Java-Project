package com.oop.ClassObject;

public class HistoryBook {
	
	
	//Class Attributes
	String title = "Lost Nation";
	String author = "James Aweky";
	int published = 1945;
	double price = 38.68;

	public static void main(String[] args) {

		HistoryBook bookName =  new HistoryBook();
		
		System.out.println("The book title is: " + bookName.title + ".");
		System.out.println("The author of the " 
		        + bookName.title + " is " 
				+ bookName.author + "."
				+ "\n The book was published in " 
				+ bookName.published + "."
				+ "\n The book price is " + "$" 
				+ bookName.price + "US dollars.");
	}

}
