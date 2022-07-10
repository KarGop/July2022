package week1.day1;
//Find Factorial of a given number
public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
//		for(int i=1;i<=n;i++) {
//		fact=fact*i;
//		}
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}
