package com.sujata.assignment;

public class AdditionOfTwoBinary {

	public static  String BinaryAdd(String s1, String s2)
	{
		 String first, second;
	        if(s1.length() >= s2.length())
	        {
	            first = s1;
	            second = s2;
	        }
	        else
	        {
	            first = s2;
	            second = s1;
	        }
		int carry=0;
		StringBuilder result=new StringBuilder();
		for(int i=first.length()-1,j=second.length()-1;i>=0;i--,j--)
		{
			int a=('0' - s1.charAt(i))* -1;
			int b=0;
			if(j>=0)
			{
				b=('0'- s2.charAt(i))* -1;
			}
			result.append((a+b+carry)%2);
			carry=(a+b+carry)/2;
			
		}
		if(carry>0)
		{
			result.append(carry);
		}
		
		return result.reverse().toString();
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(AdditionOfTwoBinary.BinaryAdd("111", "101"));

	}

}
