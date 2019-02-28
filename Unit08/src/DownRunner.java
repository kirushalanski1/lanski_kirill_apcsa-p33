//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		
		int [] test_1 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(test_1));
		
		int [] test_2 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(RayDown.go(test_2));
		
		int [] test_3 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(RayDown.go(test_3));
	}
}