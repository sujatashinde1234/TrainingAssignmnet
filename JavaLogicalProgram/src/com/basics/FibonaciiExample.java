package com.basics;

import java.util.Scanner;

public class FibonaciiExample {

	public static void main(String[] args) 
	{
		int n,firstterm=0,secondterm=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find fibonacii::");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(firstterm);
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
		}

	}

}
