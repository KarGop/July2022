package week1.day2;
//Find the count of given character in a String
public class FindCharCount {

	public static void main(String[] args) {
		String str = "cognizant";
		char searchChar = 'k';
		int count=0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==searchChar) {
				count=count+1;
			}
		}
		System.out.println("Given character '"+searchChar+"' count in "+str+ " is "+count);
	}
}
