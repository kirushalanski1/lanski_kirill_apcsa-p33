//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(in);
		
		
		out.println("Enter a word: ");
		StringOddOrEven test_1 = new StringOddOrEven(keyboard.nextLine());
		test_1.isEven();
		out.println(test_1);
		
		out.println("Enter a word: ");
		StringOddOrEven test_2 = new StringOddOrEven(keyboard.nextLine());
		test_2.isEven();
		out.println(test_2);
		
		out.println("Enter a word: ");
		StringOddOrEven test_3 = new StringOddOrEven(keyboard.nextLine());
		test_3.isEven();
		out.println(test_3);
		
		out.println("Enter a word: ");
		StringOddOrEven test_4 = new StringOddOrEven(keyboard.nextLine());
		test_4.isEven();
		out.println(test_4);
		
		out.println("Enter a word: ");
		StringOddOrEven test_5 = new StringOddOrEven(keyboard.nextLine());
		test_5.isEven();
		out.println(test_5);
		
	}
}