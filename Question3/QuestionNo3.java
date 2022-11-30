package com.assingment.app;

import java.util.Scanner;

public class QuestionNo3 {
	public static void main(String[] args)
	{
		//3. Read two numbers, divide the first number by the second and print the quotient and remainder.
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNum=input.nextInt();
		System.out.print("Enter second number: ");
		int secondNum=input.nextInt();
		
		System.out.println("The quotient is :"+ findQuotient(firstNum,secondNum));
		System.out.println("The remainder is :"+ findRemainder(firstNum,secondNum));	
	}
	
	private static float findQuotient(int first,int second)
	{
		return first/second;
	}
	private static float findRemainder( int first, int second)
	{
		return first%second;
	}
}
