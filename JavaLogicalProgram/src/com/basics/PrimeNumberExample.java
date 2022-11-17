package com.basics;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) 
	{
		int num,sum=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number...");
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println(num+" is prime number..");
		}
		else
		{
			System.out.println(num+" is not prime number..");
		}
		

	}

}
