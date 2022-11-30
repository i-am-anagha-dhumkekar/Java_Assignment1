package com.assingment.app;

import java.util.Scanner;

public class QuestionNo7 {
	//7. Raju’s basic salary is given. His dearness allowance is 40% of the basic salary and house rent allowance is 20%. Calculate his total salary.
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		int basicSalary=input.nextInt();
		
		double dearnessAllowance=basicSalary*0.4;
		double hra=basicSalary*0.2;
		double result=(basicSalary+dearnessAllowance+hra);
		System.out.println("Total salary is: "+result);
	}
	
}
