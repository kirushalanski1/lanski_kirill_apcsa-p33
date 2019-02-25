//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run_1 = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run_1);
		System.out.println("biggest = " + run_1.getBiggest() + "\n");

		BiggestDouble run_2 = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		out.println(run_2);
		System.out.println("biggest = " + run_2.getBiggest() + "\n");

		BiggestDouble run_3 = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		out.println(run_3);
		System.out.println("biggest = " + run_3.getBiggest() + "\n");
		
	}
}