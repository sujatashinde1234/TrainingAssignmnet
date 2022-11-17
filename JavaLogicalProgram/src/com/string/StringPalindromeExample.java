package com.string;

public class StringPalindromeExample {

	public static void main(String[] args)
	{
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("String is plaindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

}
