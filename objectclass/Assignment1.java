package com.sujata.assignment;

import java.util.Scanner;

public class Assignment1
{

	public static void Triangle(int rows)
	{
		System.out.println("Number Pattern");
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+ " ");
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
	
	
	
	public static void palindrome( int num)
	{
		int reverse=0,rem;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(temp==reverse)
		{
			System.out.println(temp+ " is palindrome");
		}
		else
		{
			System.out.println(temp+ " is not Palindrome");
		}
		
		
		
	}
	
	public static long DecimalToBinary(int num)
	{
		long binarynumber=0;
		int rem,i=1,step=1;
		while(num!=0)
		{
			rem=num%2;
			System.out.println("step "+step++ +":"+num+"/2");
			System.out.println("quotient="+num/2+" Remainder ="+rem);
			num=num/2;
			binarynumber+=rem*i;
			i=i*10;
		}
		return binarynumber;
		
		
		
	}
	
	public static void BinaryToDecimal(long binaryNumber)
	{
		long decimalNumber=0, j=1,remainder;
		  while (binaryNumber != 0) 
		  {
		   remainder = binaryNumber % 10;
		   decimalNumber = decimalNumber + remainder * j;
		   j = j * 2;
		   binaryNumber = binaryNumber / 10;
		  }
		  System.out.println("Binary To Decimal Number: " + decimalNumber);
	}
	
	public static void squareRoot(long n)
	{
		float t;
		float sqrRoot=n/2;
		do
		{
			t=sqrRoot;
			sqrRoot=(t+(n/t))/2;
		}while((t-sqrRoot)!=0);
		System.out.println(" square Root of"+n+" is"+sqrRoot);
	}
	
	 public static boolean isprime(int n)
	   {
		   boolean flag=true;
		   for(int i=2;i<=n-1;i++)
		   {
			   if(n%i==0) {
				   flag=false;
				   break;
			   }
		   }
		   return flag;
	   }
	
	public static void main(String[] args) 
	{
		
		Assignment1.Triangle(4);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to find number is palindrome or Not::");
		int num=sc.nextInt();
		Assignment1.palindrome(num);
		
		System.out.println(" ");
		
		System.out.println("Enter Decimal Value to convert into Binary::");
		int n=sc.nextInt();
		long binary=DecimalToBinary(n);
		System.out.println("\n" + n + " = " + binary);
		
		System.out.println(" ");
		
		System.out.println("Enter Binary Number convert into Decimal::");
		long binaryNumber=sc.nextLong();
		Assignment1.BinaryToDecimal(binaryNumber);
		
		System.out.println(" ");
		
		System.out.println("Enter Number To find squareRoot::");
		long num1=sc.nextLong();
		Assignment1.squareRoot(num1);
		
		
		
		
		

	}

}




//Number Pattern
//1 
//1 2 1 Think
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//
//Enter any number to find number is palindrome or Not::
//3333
//3333 is palindrome
//
//Enter Decimal Value to convert into Binary::
//100
//step 1:100/2
//quotient=50 Remainder =0
//step 2:50/2
//quotient=25 Remainder =0
//step 3:25/2
//quotient=12 Remainder =1
//step 4:12/2
//quotient=6 Remainder =0
//step 5:6/2
//quotient=3 Remainder =0
//step 6:3/2
//quotient=1 Remainder =1
//step 7:1/2
//quotient=0 Remainder =1
//
//100 = 1100100
//
//Enter Binary Number convert into Decimal::
//111110
//Binary To Decimal Number: 62
//
//Enter Number To find squareRoot::
//25
//square Root of25 is5.0

