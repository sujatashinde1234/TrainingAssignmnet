package com.string;

public class ReverseStringExample {

	public static void main(String[] args) 
	{
		String str="sujata shinde";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println("Original String is::"+str);
		System.out.println("Reverse String is::"+revstr);
	}

}
