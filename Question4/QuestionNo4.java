package com.assingment.app;

import java.util.Scanner;

public class QuestionNo4 {
	public static void main(String[] args)
	{
		//4. The distance between two cities (KM) is input through the keyboard. Write a program to convert and print this distance in meters, feet, inches and centimeters.
		Scanner input=new Scanner(System.in);
		System.out.print("Enter distance between two cities: ");
		float distance=input.nextFloat();
		
		System.out.println("The distance in meters is "+convertToMeter(distance));
		System.out.println("The distance in feets is "+convertToFeets(distance));
		System.out.println("The distance in inches is "+convertToInches(distance));
		System.out.println("The distance in centimeter is "+convertToCentimeter(distance));
	}
	
	private static float convertToMeter(float distance)
	{
		return distance*1000;
	}
	private static double convertToFeets(float distance)
	{
		return distance*3280.84;
	}
	private static double convertToInches(float distance)
	{
		return distance*39370.1;
	}
	private static double convertToCentimeter(float distance)
	{
		return distance*100000;
	}
}
