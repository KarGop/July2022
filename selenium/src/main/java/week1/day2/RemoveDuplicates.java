package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String result="";
		System.out.println("Sentence before removing duplicate words: " +text);
		// Split the given sentence to get each word as String array
		String[] word = text.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					word[j]="";	
				}
			}
		}
		for (String s : word) {
			result = result + s + " ";		
		}
		System.out.println("Sentence after removing duplicate words: " +result);
	}
}
