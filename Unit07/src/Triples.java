//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i <= number; i++) {
			if (a % i == 0 && b % i == 0 && c % i ==0) {
				max = i;
			}
		}



		return max;
	}

	public String toString()
	{
		String output="";


		for (int A = 1; A <= number; A++) {
			for (int B = 1; B <= number; B++) {
				for (int C = 1; C <= number; C++) {
					if (greatestCommonFactor(A,B,C) == 1 && C > B && B > A) {
						if (Math.pow(A, 2) + Math.pow(B, 2) ==  Math.pow(C, 2)) {
							if (A % 2 == 0 && B % 2 == 1 && C % 2 == 1) {
							output = output + A + " " + B + " " + C + "\n";
							}
							else if (A % 2 == 1 && B % 2 == 0 && C % 2 == 1) {
							output += A + " " + B + " " + C + "\n";
							}
						}
					}	
				}
			}
		}
		


		return output+"\n";
	}
}