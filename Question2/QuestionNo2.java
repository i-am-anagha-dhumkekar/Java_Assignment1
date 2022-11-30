package com.assingment.app;

import java.util.Scanner;

public class QuestionNo2 {

	public static void main(String[] args)
	{
		//2. Ramu visited the bookstore to buy books for his kid. He bought notebooks for Rs.100 and magic pot for Rs.50. How much money did Ramu spend in the bookstore?
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Price of notebooks: ");
		int priceNotebooks=input.nextInt();
		System.out.print("Enter the Price of notebooks: ");
		int priceMagicPot=input.nextInt();
		
		System.out.println("Ramu Spent total : "+summation(priceNotebooks,priceMagicPot));
	}
	private static int summation(int priceNotebooks,int priceMagicPot)
	{
		return priceNotebooks+priceMagicPot;
	}
}
