package com.sujata.assignment;

import com.nikhil.demo.Box;
import com.nikhil.demo.BoxWeight;

public class BoxMaster1 {

	public static void main(String[] args) {
		Box1 b1=new Box1(10,5,20);
		Box1 b2=new Box1(2,5,10);
		System.out.println("calculate Volume of a Box");
		System.out.println("Volume of box b1 is::"+b1.CalVolume());
		System.out.println("Volume of Box b2 is::"+b2.CalVolume());
		Box1 B3=new Box1();
		
		BoxWeight1 B1=new BoxWeight1(10,20,5,2000);
		System.out.println("Density of Box::");
		System.out.println(B1.calDensity());


	}

}
