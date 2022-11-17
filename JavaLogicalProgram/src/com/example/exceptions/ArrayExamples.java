package com.example.exceptions;

public class ArrayExamples {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,6,7,8,11,13,14,15,19,20,21};
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 || arr[i]==4 || arr[i]==6 || arr[i]==8)
			{
				System.out.print(arr[i]);
			}else
			{
				System.out.print(" ");
			}
			
		}

	}

}
