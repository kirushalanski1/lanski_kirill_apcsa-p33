//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char init_letter = letter;
		int set_counter = amount;
		int row_counter = amount;
		
		
		for (int z = 0; z < amount; z++) { // # of rows
			for (int w = 0; w < row_counter; w++) { // # of sets in each row
				for (int i = 0; i < set_counter; i++) { // # of letter repeats in each set
					output += letter;
				}
				output += " ";
				if (letter == 'z') {
					letter = 'a';
				}
				else if (letter == 'Z') {
					letter = 'A';
				}
				else {
					int character = (int)letter + 1;
					letter = (char)character;
				}
			
				set_counter -= 1;
			}
			set_counter = amount;
			letter = init_letter;
			output += "\n";
			row_counter -= 1;
		}
		
		
		return output;
	}
}