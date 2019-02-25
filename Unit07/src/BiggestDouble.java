//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double nums[] = {one, two, three, four};
		double biggest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > biggest) biggest = nums[i];
		}
		return biggest;
	}

	public String toString()
	{
	   return "" + getBiggest();
	}
}