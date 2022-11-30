package com.assingment.app;

import java.util.Scanner;

public class QuestionNo6 {
	public static void main(String[] args)
	{
		//6. Two numbers are stored in locations i and j. Write a program to interchange the numbers.
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number i: ");
		int i=input.nextInt();
		System.out.print("Enter second number: ");
		int j=input.nextInt();
		
		int k=i;
		i=j;
		j=k;
		System.out.println("Changed values of i and j are: "+i+" , "+j);
		
		
	}
	
}
