package com.test;

public class RemoveElementFromArray {

    public int removeElement(int[] nums, int val) { 

    	int count=0;
    	
    	for(int i=0; i<nums.length; i++)
    	{

    		if(nums[i] != val )
    		{
    			nums[count]=nums[i];
    			count++;
    		}
    	}
    	
    	return count;
    }
    
	public static void main(String[] args) {
		
		RemoveElementFromArray removeElementFromArray=new RemoveElementFromArray();
		int[] arr=new int[] {3,2,3,2,3};
		System.out.println(removeElementFromArray.removeElement(arr, 3));
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
