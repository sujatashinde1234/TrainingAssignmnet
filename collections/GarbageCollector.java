package com.sujata.assignment.day3;



public class GarbageCollector 
{
	String s1;
	
	

	public GarbageCollector(String s1) {
		super();
		this.s1 = s1;
	}



	public static void main(String[] args) {
		GarbageCollector G=	new GarbageCollector("t1");
		G=null;
		System.gc();
	}
		 
		
		
	



	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.s1+" Successfully Garbage");

}
}