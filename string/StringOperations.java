package com.sujata.assignment.day3;

import java.util.Scanner;

public class StringOperations 
{
	public static void InsertIndex()
	{
		String s1,s2;
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String::");
		s1=sc.next();
		System.out.println("Enter Second String::");
		s2=sc.next();
		System.out.println("enter index of first string which index you want to insert new string::");
		index=sc.nextInt();
		
		if(s1!=null)
		{
			
			String res=s1.substring(0,index)+s2+s1.substring(index);
			System.out.println("New String is::"+res);
			
		}
	}
    public static void StringDecending()
    {
    	String s1;
    	char temp;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String TO Display in Descending::");
    	s1=sc.next();
    	char c[]=s1.toCharArray();
    	for(int i=0;i<c.length;i++)
    	{
    		for(int j=i+1;j<c.length;j++)
    		{
    			if(c[i]<c[j])
    			{
    				temp=c[i];
    				c[i]=c[j];
    				c[j]=temp;
    			}
    		}
    	}
    	System.out.println(c);
    }
		
	public static void StringAscending()
	{
		String s1;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String For To print Ascending::");
		s1=sc.next();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		System.out.println(c);
	}

	public static void RemoveVowels()
	{
	    String s1;
	    String s2=" ";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String TO remove Vowles::");
	    s1=sc.next();
	    char c[]=s1.toCharArray();
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i]=='a'|| c[i]=='A')
	    	{
	    		s2=s2+" ";
	    	}
	    	else if(c[i]=='e'||c[i]=='E')
	    	{
	    		s2=s2+"";
	    	}
	    	else if(c[i]=='i'||c[i]=='I')
	    	{
	    		s2=s2+"";
	    		
	    	}
	    	else if(c[i]=='o' || c[i]=='O')
	    	{
	    		s2=s2+"";
	    		
	    	}
	    	else if(c[i]=='u'|| c[i]=='U')
	    	{
	    		s2=s2+" ";
	    	}
	    	else
	    	{
	    		s2=s2+s1.charAt(i);  	
	    	}
	    	
	    	
	    	
	    }
		System.out.println(s2);
		
	}
	
	public static void RepeatedAlphabet()
	{
		String s;
		char s2 = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String To Print RepeatedAlphabets::");
		s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					s=s+" ";
				}
				else
				{
					s2=s.charAt(i);
				}
			}
		}
		System.out.println(s2);
		
	}
	public static void StringBuilderAndStringBuffer()
	{
		StringBuilder s1=new StringBuilder("sujata");
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10;i++)
		{
			System.out.println(s1.append("shinde")); 
		}
		System.out.println("Time Taken By StringBuilder::"+(System.currentTimeMillis()-startTime)+" ms");
		
		long startTime1=System.currentTimeMillis();
		StringBuffer s2=new StringBuffer("sujata");
		for(int i=0;i<10;i++)
		{
			System.out.println(s2.append("shinde"));
		}
		System.out.println("Time Taken By StringBuffer::"+(System.currentTimeMillis()-startTime1)+"ms");
	}
	public static void StringConstantPool()
	{
		String s1="sujata";
		String s2="sujata";
		if(s1==s2)
		{
			System.out.println("It's create same objects for both the reference "
					+ "objects are created in String Constant pool String is equal");
		}
		else
		{
			System.out.println("String is not equal");
		}
		
		String str=new String ("sujata");
		String str1=new String("sujata");
		if(str==str1)
		{
			System.out.println("String is equal");
		}else
		{
			System.out.println("It's create different Objects for both the refrences  and "
					+ "objects are created in heap memory as well as String constant pool that's why both the Strings are not equal");
		}
	}
	
public static void PaindromeString()
{
	String strarr[]= {"sujata","madam","aba"};
	String a;
	for(int i=0;i<strarr.length;i++)
	{
		a=strarr[i];
		for(int j=i+1;j<strarr.length;j--)
		{
			
		}
		
	}
	

}
public static void SequenceOfCharcahter()
{
   int vCount = 0, cCount = 0;    
   String str = "This is Java String operations Program";    
    str = str.toLowerCase();    
    
    for(int i = 0; i < str.length(); i++) {    
     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
     {    
        
        vCount++;    
    }    
    else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
        cCount++;    
    }    
}    
     System.out.println("Number of vowels: " + vCount);    
     System.out.println("Number of consonants: " + cCount);    
}

	public static void main(String[] args) {
	
       StringOperations.InsertIndex();
       StringOperations.StringDecending();
       StringOperations.StringAscending();
       StringOperations.RemoveVowels();
       StringOperations.RepeatedAlphabet();
       StringOperations.StringBuilderAndStringBuffer();
       StringOperations.StringConstantPool();
	   StringOperations.PaindromeString();
	    StringOperations.SequenceOfCharcahter();
		
		

	}
	
}
