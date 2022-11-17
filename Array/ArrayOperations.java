package com.sujata.assignment.day3;

import java.util.Scanner;

public class ArrayOperations {

	public static void ThirdMaximun(int number)
	{
		int arr[]= {12,13,14,15,16};
		int temp;
		for(int i=0;i<number;i++)
		{
			for(int j=i+1;j<number;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third Maximum Number of Array::"+arr[number-3]);
	}
	
	public static void DuplicateNumberFromArray()
	{
		int arr[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of element what you want to enter::");
		int n=sc.nextInt();
		System.out.println("Enter Array elements::");
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println("array elements are::");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Duplicates elements From array::");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[j]);
				}
			}
		}
	}
	public static void JaggedArray()
	{
		int arr[][]= new int[100][100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows::");
		int r=sc.nextInt();
		System.out.println("Enter column::");
		int c=sc.nextInt();
		System.out.println("Enter Array elemets::");
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Dynamic Matrix is::");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void OddEvenPrimePerfect()
	{
		int arr[]= {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" Number is Even");
			}
			else
			{
				System.out.println(arr[i]+" Number is ODD");
				
			}
			
			
		}
	}
	public static void PrimeNumber()
	{
		boolean flag=false;
		int arr[]= {1,2,3,4,5};
		for(int i=2;i<arr.length/2;i++)
		{
			if(arr.length%i==0)
			{
				flag=true;
				break;
			}
		
		if(!flag)
		{
			System.out.println(arr[i]+" is prime number");
		}else
		{
			System.out.println(arr[i]+" is not prime number");
		}
		}
	}
	public static void perfectNumber()
	{
		int num[]= {2,3,4,5,6,7,8,9};
		int sum[] = null,i;
		for( i=1;i<num.length;i++)
		{
			if(num[i]%i==0)
			{
			   sum[i]=sum[i]+i;
			}
		}
		if(sum[i]==num[i])
		{
			System.out.println(num+"Number is perfect..");
		}
		else
		{
			System.out.println(num+"Number is not perfect.");
		}

	}
	public static void AscendingDecending()
	{
		System.out.println("Half Array Ascending And Half Array Descending::::");
		int arr[]= {2,4,6,7,1,45,56,23};
		int temp = 0;
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=i+1;j<arr.length/2;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			
				
				
			}
			System.out.print(" "+arr[i]);
			
			
		}
		
		
		int temp1=0,i,j;
		for( i=arr.length/2;i<arr.length;i++)
		{
			for( j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp1=arr[j];
					arr[j]=arr[i];
					arr[i]=temp1;
				}
			}
			System.out.print(" "+arr[i]);
		}
		
	}
	public static void LCMArray()
	{
	 int[] myArray = {25, 50, 125, 625};
     int min, max, x, lcm = 0;
    
     for(int i = 0; i<myArray.length; i++) {
        for(int j = i+1; j<myArray.length-1; j++) {
           if(myArray[i] > myArray[j]) {
              min = myArray[j];
              max = myArray[i];
           } else {
              min = myArray[i];
              max = myArray[j];
           }
           for(int k =0; k<myArray.length; k++) {
              x = k * max;
              if(x % min == 0) {
                 lcm = x ;
              }
           }
        }
     }
     System.out.println("LCM Of array element is::"+lcm);
	}
	public static void HCFArray()
	{
		int arr[]= {4,16,25,46,67,89};
		long result=arr[0];
		int temp,i,j;
		for( i=1;i<arr.length;i++)
		{
			result=hcf(result,arr[i]);
		}
		System.out.println("HFC of Array elements is::"+result);
	}
	public static long hcf(long a, long b)
	{
		while(b>0)
		{
			long temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		//ArrayOperations.ThirdMaximun(5);
		//ArrayOperations.DuplicateNumberFromArray();
		//ArrayOperations.JaggedArray();
		//ArrayOperations.OddEvenPrimePerfect();
		//ArrayOperations.PrimeNumber();
		//ArrayOperations.perfectNumber();
		//ArrayOperations.AscendingDecending();
		//ArrayOperations.LCMArray();
		ArrayOperations.HCFArray();
	}

}
