package com.test;

public class RemoveDuplicatesFromArray {
	 public int removeDuplicates(int[] nums) {
		 if(nums.length==0 || nums.length==1)
			 return nums.length;
		 int lengthOfUniques = 1; 
		 int num1=0, num2=1;
		 int length= nums.length;
		 while(length>1)
		 {
			 length = length-1;
			 if(nums[num1]!=nums[num2])
			 {
				 lengthOfUniques=lengthOfUniques+1;
			 }
			 nums[lengthOfUniques-1]= nums[num2];
		 	 num1=num1+1;
			 num2 = num2+1;
		 }
		 
	   return lengthOfUniques;
	 }
	 
	 public static void main(String[] args) {
		
		 RemoveDuplicatesFromArray removeDuplicatesFromArray=new RemoveDuplicatesFromArray();
		 System.out.println(removeDuplicatesFromArray.removeDuplicates(new int[] {1,1,2,3,4,4,4}));
	}
}
