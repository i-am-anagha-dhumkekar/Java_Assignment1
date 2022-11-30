package com.assingment.app;

import java.util.Scanner;

public class QuestionNo1 {
	// 1. For 10 oranges we have to pay Rs.45 what will be the price of 1 orange.
	public static void main(String[] args)
	{
		int quantityOfOranges;
		float priceOfAllOranges;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Quantity of Oranges Purchased: ");
		quantityOfOranges=input.nextInt();
		System.out.print("Enter total price paid : ");
		priceOfAllOranges=input.nextFloat();
		
		System.out.println("Price of One Orange is: "+calculatePriceForOne(quantityOfOranges,priceOfAllOranges));
	}
	private static double calculatePriceForOne(int quantity,float price)
	{
		double result=(price/10);s
		return result;
	}
}
