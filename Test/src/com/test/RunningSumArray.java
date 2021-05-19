package com.test;

public class RunningSumArray {

	public int[] runningSum(int[] nums) {
      int[] sumArray=new int[nums.length];
      
      for(int i=0;i<nums.length;i++) {
    	  if(i>0) {
    		  sumArray[i]=sumArray[i-1]+nums[i];
    	  } else {
    		  sumArray[i]=nums[i];
    	  }
      }
	  return sumArray;
    }
	
	
	public static void main(String[] args) {
		RunningSumArray runningSumArray=new RunningSumArray();
		int[] sumArray=runningSumArray.runningSum(new int[] {3,1,2,10,1});
		for(int i=0; i<sumArray.length; i++) {
			System.out.println(sumArray[i]);
		}

	}

}
