package com.basics;

import java.util.Scanner;

public class ArmstrongNumberEx {

	public static void main(String[] args) 
	{
		int num,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number::");
		num=sc.nextInt();
		int number=num;
		while(number!=0)
		{
			temp=number%10;
			sum=sum+temp*temp*temp;
			number=number/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}

	}

}
