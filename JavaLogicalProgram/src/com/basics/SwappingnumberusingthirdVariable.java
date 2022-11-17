package com.basics;

import java.util.Scanner;

public class SwappingnumberusingthirdVariable {

	public static void main(String[] args) 
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a::");
		a=sc.nextInt();
		System.out.println("Enter b::");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after Swapping a::"+a+" b::"+b);

	}

}
