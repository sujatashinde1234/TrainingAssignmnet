package com.string;

public class StringFuncations {

	public static void main(String[] args) 
	{
       String s=new String("sujata");
       String s1=s.concat("shinde");
       System.out.println(s1);
       System.out.println(s);
       
       String str=new String("sujata");//two different object is created for same string
       String str1=new String("sujata");
       
       System.out.println(str==str1);//false
       
       String s2="sujata";//only one object is created for same object or string
       String s3="sujata";
       
       System.out.println(s2==s3);//true
       
       System.out.println(str.equals(str1));//true
       
       System.out.println(str.equals(s3));//true
       
       System.out.println(str==s2);//false
       
       System.out.println(s.length());
       
       
       
       byte [] b= {122,123,124};
       String b1=new String(b);
       System.out.println(b1);
       
       char c[]=new char[]{'a','b','c'};
      // String b2=new String(c);
       System.out.println(c);
       //System.out.println(b2);
       
       
       
       
       
	}

}
