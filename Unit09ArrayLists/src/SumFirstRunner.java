//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;
public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList <Integer> test_1 = new ArrayList<Integer>();
		for (int item : new int [] {-99,1,2,3,4,5,6,7,8,9,10,5}) {
			test_1.add(item);
		}
		System.out.println(ListSumFirst.go(test_1));
	}
}