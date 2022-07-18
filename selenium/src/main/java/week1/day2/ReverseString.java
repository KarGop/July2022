package week1.day2;
// Reverse the String
//Goal: To understand the String, loop
public class ReverseString {

	public static void main(String[] args) {
		String str="hello";
		String rev="";
		System.out.println("Original word: "+ str);
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed word: "+ rev);
	}

}
