//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		out.printf("Bill after discount ::  " + "%.2f%n", Discount.getDiscountedBill(amt1));
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		out.printf("Bill after discount ::  " + "%.2f%n", Discount.getDiscountedBill(amt2));
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		out.printf("Bill after discount ::  " + "%.2f%n", Discount.getDiscountedBill(amt3));
	}
}