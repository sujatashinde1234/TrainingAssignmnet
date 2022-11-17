package com.sujata.assignment;

import java.util.Scanner;

public class Patient 
{
	private String PatientName;
	private double height,weight;
	private double feet;
	
	
	public Patient() {
		super();
	}

	public Patient(String patientName, double height, double weight) {
		super();
		PatientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	
	public void GetData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Patient Name::");
		PatientName=sc.next();
		System.out.print("Enter Patient weight in Kg::");
		weight=sc.nextDouble();
		System.out.print("Enter Patient Height in meter::");
		height=sc.nextDouble();
		
	}
	
	public void Display()
	{
		System.out.println("Name of Patient is::"+PatientName);
		System.out.print("BMI of Patient is::");
		System.out.println(computeBMI());
	}

	public double computeBMI()
	{
	    return this.weight/(this.height*this.height);
	} 
	public static void main(String[] args) {
		Patient P=new Patient();
		P.GetData();
		P.Display();
		
	
	}
	

}


/*
 * OutPut
 * Enter Patient Name::sujata
 *  Enter Patient weight in Kg::50 
 *  Enter Patient Height in meter::1.75
 *   Name of Patient is::sujata 
 *   BMI of Patient is::16.3265306122449
 */

