//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test_1 = new LetterRemover("I am Sam I am   a", 'a');
		out.print(test_1);
		
		LetterRemover test_2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		out.print(test_2);
			
		LetterRemover test_3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		out.print(test_3);
		
		LetterRemover test_4 = new LetterRemover("abababababa", 'b');
		out.print(test_4);
		
		LetterRemover test_5 = new LetterRemover("abababababa", 'x');
		out.print(test_5);
	}
}