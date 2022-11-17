package com.basics;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutusingthirdvariable {

	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number::");
		x=sc.nextInt();
		System.out.println("Enter second number::");
		y=sc.nextInt();
		System.out.println("Number before swapping x::"+x+" y::"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Number After Swapping x::"+x+" y::"+y);
		
		
		

	}

}
