package com.example.exceptions;

public class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		super();
	}
	InvalidAgeException(String message) 
	{
		
		super(message);
	}
	InvalidAgeException(Throwable cause)
	{
		super(cause);
	}
	InvalidAgeException(String message,Throwable cause)
	{
		super(message,cause);
	}

}
