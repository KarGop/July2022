package week1.day1;
// Print Fibbinocci series for first 11 numbers
public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.print(firstNum+" ");
		System.out.print(secNum+" ");
		for(int i=1;i<=9;i++) {
			sum=firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.print(sum+" ");
		}
	}
}
