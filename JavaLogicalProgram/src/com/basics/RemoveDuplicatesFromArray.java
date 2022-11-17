package com.basics;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,3,4,5,6,6,7,7,8,9,8,2,1};
		boolean found=false;
		int current=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(current==arr[i] && !found)
			{
				found=true;
			}
			else if(current!=arr[i])
			{
				System.out.println(current);
				current=arr[i];
				found=false;
			}
		}
		
		//System.out.println(current);
		
	}

}
