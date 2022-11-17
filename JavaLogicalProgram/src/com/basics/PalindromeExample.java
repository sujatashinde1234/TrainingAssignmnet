package com.basics;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) 
	{
		int num,reverse=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number::");
        num=sc.nextInt();
         int temp=num;
        while(num!=0)
        {
        	rem=num%10;
        	reverse=reverse*10+rem;
        	num=num/10;
        	
        }
        if(temp==reverse)
        {
        	System.out.println(temp+" is palindrome number");
        }
        else
        {
        	System.out.println(temp+" is not palindrome number");
        }
	}

}
