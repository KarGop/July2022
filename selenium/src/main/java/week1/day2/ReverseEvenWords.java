package week1.day2;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] s = test.split(" ");
		System.out.println("Original sentence : "+test);
		System.out.print("After reversing even words : ");
		for (int i = 0; i < s.length; i++) {
			if(i%2==0) {
				System.out.print(" ");
				System.out.print(s[i]);
			} else {
				System.out.print(" ");
				char[] charArray = s[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
				}
			}
		}	
	}
}
