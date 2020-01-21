package ifStatement;

public class WhileLoop {

	public static void main(String[] args) {

		// print values from 1 to 12

		int a = 1;
		while (a <= 12) {
			System.out.println("a value is now => " + "[" + a + "]");
			a++;
		}

		// for loop does the same

		System.out.println("_______________For Loop__________________");

		for (int i = 0; i <= 12; i++) {
			System.out.println("i is now " + "[" + i + "]");
		}

	}

}
