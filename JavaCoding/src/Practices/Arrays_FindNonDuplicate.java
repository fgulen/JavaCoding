package Practices;

import java.util.Scanner;

public class Arrays_FindNonDuplicate {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		   
		 
	
		 for (int i = 0; i < nums.length; i++) {	 
			 
			 if(nums[0]==nums[i+1] ) {
				 System.out.println(nums[i+1]);
				 break;
			 }
			
		}
	
	}

}
