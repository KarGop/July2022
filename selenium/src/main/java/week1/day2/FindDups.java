package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] nums= {5,8,2, 3, 5, 1, 0, 3};
		Arrays.sort(nums);
		System.out.println("Duplicate numbers are ..");
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					System.out.print(i+" ");
				}
			}
			// ArrayIndexOutOfBoundsException will come
			//for(int i=0;i<nums.length-1;i++) {
			//			if(nums[i]==nums[i+1]) {
			//				System.out.print(i+" ");
			//			}
			//}
		}
	}

}
