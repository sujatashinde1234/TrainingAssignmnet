package com.sujata.assignment;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String empName="";
	private double basicSal, DA, IT, grossSalary, NetSalary;

	
	public Employee() {
		super();
	}

	public Employee(int empid, String empName, double basicSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.basicSal = basicSal;
		
	}
	  public void GetData() 
	  { 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Employee Id::"); 
		  empid=sc.nextInt();
		  System.out.println("Enter Employee Name::"); 
		  empName=sc.next();
		  System.out.println("Enter Employee Basic Salary::");
		  basicSal=sc.nextDouble();
		  
	   }

	  public void  CalNetSalary() 
	  { 
		  DA = basicSal * 0.52; 
		  grossSalary = basicSal+DA; 
		  IT = grossSalary * 0.30; 
		  NetSalary = (basicSal + DA) - IT; 
		  System.out.println("Employee ID="+empid);
		  System.out.println("Employee Name="+empName);
		  System.out.println("Net Salary is::"+NetSalary);
	  
	  }
	 
	 
	
	
	 
	

}
