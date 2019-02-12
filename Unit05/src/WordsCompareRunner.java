//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	 

	   WordsCompare test_1 = new WordsCompare("abe","ape");
	   test_1.compare();
	   out.println(test_1);
	   
	   WordsCompare test_2 = new WordsCompare("kirusha","sean");
	   test_2.compare();
	   out.println(test_2);
	   
	   
	   WordsCompare test_3 = new WordsCompare("kirusha","allen");
	   test_3.compare();
	   out.println(test_3);
	   
	   WordsCompare test_4 = new WordsCompare("193","1910");
	   test_4.compare();
	   out.println(test_4);
	   
	   WordsCompare test_5 = new WordsCompare("goofy","godfather");
	   test_5.compare();
	   out.println(test_5);
	   
	   
	   
	   
	   
		
		

	}
}