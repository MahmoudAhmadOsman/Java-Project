package ifStatement;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays using for each

		String[] Names = { "Name 1 ", "Name 2", "Name 3 ", "Name 4" };

		for (String name : Names) {
			System.out.println(name);
		}

		System.out.println("____________Below is array length_____________________");

		// looping through array using for loop
		for (int i = 0; i < Names.length; i++) {
			System.out.println(Names[i]);
		}

	}

}
