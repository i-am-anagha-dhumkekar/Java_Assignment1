package com.assingment.app;

import java.util.Scanner;

public class QuestionNo5 {
	public static void main(String[] args)
	{
		//5. The temperature of a city in Fahrenheit is given. Write a program to convert it into Celsius.
		Scanner input=new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		int tempInF=input.nextInt();
		
		System.out.println("Temperature in Celcius is : "+convertTempToC(tempInF));
	}
	private static int convertTempToC(int temp)
	{
		return ((temp-32)*5)/9;
	}
}
