package com.basics;

import java.util.Scanner;

public class SumOfdigitsFromnumberEx {

	public static void main(String[] args) 
	{
		int num,sum=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		num=sc.nextInt();
		for(sum=0;num!=0;num=num/10)
		{
			sum=sum+num%10;
		}
		System.out.println("sum of digits is::"+sum);
		

		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum of digits is::"+sum);
	}

}
