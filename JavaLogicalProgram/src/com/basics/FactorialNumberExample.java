package com.basics;

import java.util.Scanner;

public class FactorialNumberExample {

	public static void main(String[] args) 
	{
		int num;long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(" factorial of"+num+"is"+fact);
		

	}

}
