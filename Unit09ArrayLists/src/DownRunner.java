//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
public class DownRunner
{
	public static void main( String args[] )
	{	
		
		
		ArrayList<Integer> test_1 = new ArrayList <Integer>();
		for (int item : new int[] {10,9,8,7,6,5,4,3,2,1,-99}) {
			test_1.add(item);
		}
		System.out.println(ListDown.go(test_1));
		
		ArrayList<Integer> test_2 = new ArrayList <Integer>();
		for (int item : new int[] {345}) {
			test_2.add(item);
		}
		System.out.println(ListDown.go(test_2));
	}
}