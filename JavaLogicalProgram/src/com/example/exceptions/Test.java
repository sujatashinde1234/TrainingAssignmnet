package com.example.exceptions;

public class Test {

	public static void main(String[] args) 
	{
		RegisterUser u=new RegisterUser();
		try
		{
			u.Validate(21, "Indiansss");
		}catch(InvalidAgeException ex)
		{
		    System.out.println("for Age::"+ex.getMessage());
		}catch(InvalidCitizenship ex)
		{
			System.out.println("for citizenship::"+ex.getMessage());
		}catch(Exception e)
		{
			e.getMessage();
		}

	}

}
