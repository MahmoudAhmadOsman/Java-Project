package ifStatement;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Numbers = {17, 32, 45, 96,85, 655};
		
		//print index 1
		//System.out.println(Numbers[0]);
		
		for(int number : Numbers) {
			  System.out.println(number);
		}

		
//Print some names and loop through them
		
String[] Names = {"Name 1 ", "Name 2", "Name 3 " , "Name 4"};
		
		for(String name : Names) {
			  System.out.println(name);
		}

		
		
		
	}

}
   