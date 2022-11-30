package com.assingment.app;

import java.util.Scanner;

public class QuestionNo9 {

	//9. If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter five digit number: ");
		int fiveDigitNum=input.nextInt();
		int sum=0;
		while(fiveDigitNum>0)
		{
			int lastDigit=fiveDigitNum%10;
			sum+=lastDigit;
			fiveDigitNum=fiveDigitNum/10;
		}
		System.out.println("Answer is: "+sum);
	}
}
