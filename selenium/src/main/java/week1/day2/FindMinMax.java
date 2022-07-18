package week1.day2;

import java.util.Arrays;

//Find the max and min values of the int array
//int[] nums = {22, 3981, -19, 82, 0, 45, 37};
//max -> 3981
//min -> -19
//Goal: To understand the Arrays, sort
public class FindMinMax {

	public static void main(String[] args) {
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(nums);
		System.out.println();
		System.out.println("Minimum number is : " + nums[0]);
		System.out.println("Maximun number is : "+ nums[nums.length-1]);
	}

}
