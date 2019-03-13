//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList <Integer> test_1 = new ArrayList <Integer>();
		for (int item : new int [] {11,9,8,7,6,5,4,3,2,1,-99,7}) {
			test_1.add(item);
		}
		System.out.println(test_1);
		System.out.println(ListOddToEven.go(test_1));
	}
}