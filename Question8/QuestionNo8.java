package com.assingment.app;

import java.util.Scanner;

public class QuestionNo8 {
	//8. Implement a logic to swap two numbers without using a temporary variable.
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number x: ");
		int x=input.nextInt();
		System.out.print("Enter second number y: ");
		int y=input.nextInt();
		System.out.println("Previous values of x and y are: "+x+" , "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Swapped values of x and y are: "+x+" , "+y);
	}
}
