package com.sujata.assignment;

public class PrimeNumber 
{
     public static void Prime(int n)
     {
    	 int flag,sum = 0;
    	for(int i=2;i<=n;i++)
    	{
    		flag=0;
    		for(int j=2;j<=i/2;j++)
    		{
    			if(i%j==0)
    			{
    				flag=1;
    				break;
    			}
    		}
    		if(flag==0)
    		{
    			System.out.print(i+" ");
    			
    		}
    		
    		
    	}
     }
     
    	public static int sumofdigitsRecur(int n)
    	   {
    		   if(n==0)
    			   return 0;
    		   
    		   
    		return n%10+sumofdigitsRecur(n/10);
    	   }
     
	public static void main(String[] args) 
	{
		PrimeNumber.Prime(1000);

	}

}
