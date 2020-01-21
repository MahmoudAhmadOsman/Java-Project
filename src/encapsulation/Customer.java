package encapsulation;

public class Customer {

	// Java Encapsulation example
	// Encapsulation means hiding sensitive data from users.
	// using access modifiers variables/attributes such as private, and
	// then provide public get and set methods to access and update the value of a
	// private variable

	// ============ Create private variables

	private String name;
	private String email;
	private String phone;

	
	
//Generate getter and setter
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer CustomerDetatails = new Customer();

		CustomerDetatails.name = "Mahmoud Osman";
		CustomerDetatails.email = "example.example@yahoo.com";
		CustomerDetatails.phone = "612-647-6887";

		System.out.println(CustomerDetatails.name + "\n" + CustomerDetatails.email + "\n" + CustomerDetatails.phone

		);

	}

}
