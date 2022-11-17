package com.sujata.assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		char operator;
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an Operator: +,-,*, %,or /");
		operator=sc.next().charAt(0);
		
		System.out.println("Enter first Number::");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number::");
		num2=sc.nextInt();
		
		switch(operator)
		{
		case '+':
			       result=num1+num2;
			       System.out.println("Addition is::"+result);
			       break;
			  
		case '-':
			    result=num1-num2;
			    System.out.println("subtraction is::"+result);
			    break;
			    
		case '*':
			     result=num1*num2;
			     System.out.println("Multiplication is::"+result);
			     break;
			     
			     
		case '/':
			      result=num1/num2;
			      System.out.println("Division is::"+result);
			      break;
			      
	    default:
	    	    System.out.println("Invalid Operator");
	    	    break;
		}
		
		

	}

}

/*
 * Choose an Operator: +,-,*, %,or / 
 * + 
 * Enter first Number:: 12
 * Enter Second Number:: 23 
 * Addition is::35
 */

