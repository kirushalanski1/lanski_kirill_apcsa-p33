//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		int inner_counter = word.length();
		int outer_counter = 1;
		

		for (int i = 0; i < inner_counter; i++) {
			for (int k = 0; k < outer_counter; k++) {
				for (int j = 0; j < outer_counter; j++) {
					output += word.charAt(j);
				}
			}
			output += "\n";
			outer_counter++;
		}
	
		System.out.println(output);
	}
}