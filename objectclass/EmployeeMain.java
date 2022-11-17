package com.sujata.assignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		int n;
		Employee e[] = new Employee[100];
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Number of Employee::"); 
		  n= sc.nextInt();
		 for (int i=1; i<=n; i++) 
		 {
           Employee s = new Employee();
            e[i]=s;
			s.GetData();
		 }
		 for(int i=1;i<=n;i++)
		 {
			 Employee s=new Employee();
			 System.out.println("##############("+i+"=Employee Data)################");
			 e[i].CalNetSalary();
			
		 }
		 
		
		

	}

}

/*
 * Enter Number of Employee:: 2 
 * Enter Employee Id:: 1 
 * Enter Employee Name::
 * sujata 
 * Enter Employee Basic Salary:: 12000 
 * Enter Employee Id:: 2 
 * Enter Employee Name:: 
 * rashmi 
 * Enter Employee Basic Salary:: 23000
 * ##############(1=Employee Data)################ 
 * Employee ID=1 
 * Employee Name=sujata 
 * Net Salary is::12768.0 
 * ##############(2=Employee Data)################ 
 * Employee ID=2 
 * Employee Name=rashmi 
 * Net Salary is::24472.0
 */
