//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		
		StringEquality test_1 = new StringEquality("dog" , "dog");
		test_1.checkEquality();
		out.println(test_1);

		StringEquality test_2 = new StringEquality("dog" , "cat");
		test_2.checkEquality();
		out.println(test_2);
		
		StringEquality test_3 = new StringEquality("king" , "queen");
		test_3.checkEquality();
		out.println(test_3);
		
		StringEquality test_4 = new StringEquality("queen" , "queen");
		test_4.checkEquality();
		out.println(test_4);
		
		StringEquality test_5 = new StringEquality("ilovecsa" , "ilovecsa");
		test_5.checkEquality();
		out.println(test_5);

		
		
	}
}