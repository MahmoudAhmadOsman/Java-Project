package phone.brands.com;

public class Phone {

	// 1. Initialize variable first

	String PhoneName;
	String PhoneModel;
	int PhoneISBN;
	String PhoneBrand;
	double price;

	// 2. Create a constructor

	public Phone() {
		PhoneName = "Samsung";
		PhoneModel = "J7 Prime";
		PhoneISBN = 487624697;
		PhoneBrand = "SJ8";
		price = 364.48;
	}

	public static void main(String[] args) {

		// 3. create a new object for Phone

		Phone Samsung = new Phone();

		System.out.println("Phone Details are:");
		System.out.println(" ___________________________________");
		System.out.println("The Phone Name is " + Samsung.PhoneName + ".");
		System.out.println("And the Phone Model " + Samsung.PhoneModel + ".");
		System.out.println("And the Phone Brand is " + Samsung.PhoneBrand + ".");
		System.out.println("Phone ISBN number is " + Samsung.PhoneISBN + ".");
		System.out.println("Phone price is " + Samsung.price + ".");

	}

}
