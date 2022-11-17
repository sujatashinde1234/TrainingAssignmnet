package com.basics;

import java.util.Scanner;

public class PerfectNumberExample {

	public static void main(String[] args) 
	{
		int num,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("is perfect number");
		}
		else
		{
			System.out.println("is not perfect number");
		}
		
		

	}

}
