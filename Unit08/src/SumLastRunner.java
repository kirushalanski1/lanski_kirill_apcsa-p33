//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{			
		int [] test_1 =  {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(test_1));
		
		int [] test_2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(test_2));
		
		int [] test_3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(test_3));
		
		int [] test_4 = {32767};
		System.out.println(RaySumLast.go(test_4));
	}
}