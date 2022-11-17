package com.example.exceptions;

public class InvalidCitizenship extends Exception
{
	InvalidCitizenship()
	{
		super();
	}
	InvalidCitizenship(String message)
	{
		super(message);
	}
	InvalidCitizenship(Throwable cause)
	{
		super(cause);
	}
	InvalidCitizenship(Throwable cause,String message)
	{
		super(message,cause);
	}

}
