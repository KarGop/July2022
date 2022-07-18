package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char ch;
		System.out.println("Actual string: "+test);
		System.out.print("After changes: ");
		for (int i = 0; i < test.length(); i++) {
			ch = test.charAt(i);
			if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }			
		}
	}
}