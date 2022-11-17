package com.sujata.assignment;

public class Box1 {
	
	protected int length;
	protected int breadth;
	protected int height;
	
	
	
	public Box1() {
		super();
	}

	public Box1(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int CalVolume()
	{
		return this.length*this.breadth*this.height;
	}
	
	

}
