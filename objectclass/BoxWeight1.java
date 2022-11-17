package com.sujata.assignment;

public class BoxWeight1 extends Box1
{
     private int weight;
	
	public BoxWeight1()
	{
	}
	
   public BoxWeight1(int length,int breadth,int height,int weight) {
	   super(length,breadth,height);
		this.weight = weight;
	}





	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}

   public int calDensity()
   {
	return weight/(this.length*this.breadth*this.height);
	   
   }

}
