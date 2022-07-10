package week1.day1;

import java.util.Scanner;

//Print if the given number is prime
public class IsPrime {
	public static void main(String[] args) {
		int num, i, count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = s.nextInt();
		if(num==0||num==1){  
			System.out.println(num+" is not prime number");      
		}
		else{  
			for(i=2; i<num; i++)
			{
				if(num%i == 0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(num+" is a Prime Number.");
			else
				System.out.println(num+" is not a Prime Number.");
		} 
	}	
}
