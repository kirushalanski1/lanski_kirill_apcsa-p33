//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect() {
		number = 0;
	}

	public Perfect(int num) {
		number = num;
	}

	public void setNums(int num) {
		number = num;
	}

	public boolean isPerfect()
	{
		int num = 1;
		int sum = 0;
		while (num < number) {
			if (number % num == 0) {
				sum = sum + num;
			}
			num++;
		}
		if (sum == number) {
		return true;
		}
		return false;
	}

	public String toString() {
		if (isPerfect()) {
		return number + " is perfect \n\n";
		}
		return number + " is not perfect \n\n";
	}
	
}