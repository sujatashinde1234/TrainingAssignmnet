package com.example.exceptions;

public class RegisterUser 
{
	public void Validate(int age,String citizenship) throws InvalidAgeException, InvalidCitizenship
	{
		if(age<=18)
		{
			throw new InvalidAgeException("You Are Monir!!");
		}
		else
		{
			System.out.println("You Are Eligible");
		}
		if(!"indians".equalsIgnoreCase(citizenship))
		{
			throw new InvalidCitizenship("Citizenship should be indian");
		}
		else
		{
			System.out.println("you are eligible");
		}
	}

}
