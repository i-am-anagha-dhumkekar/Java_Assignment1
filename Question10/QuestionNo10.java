package com.assingment.app;

import java.util.Scanner;

public class QuestionNo10 {

	//10. If a five-digit number is given, write a program to reverse the number.
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter five digit number: ");
		int fiveDigitNum=input.nextInt();
		String ans="";
		while(fiveDigitNum>0)
		{
			int lastDigit=fiveDigitNum%10;
			ans+=lastDigit;
			fiveDigitNum=fiveDigitNum/10;
		}
		System.out.println("Reversed string is : "+ans);
		
	}
}
