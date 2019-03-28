/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test_1 = new Card("hearts", "jack" , 11);
		System.out.println(test_1);
		
		Card test_2 = new Card("hearts" , "jack" , 11);
		System.out.println(test_2); 
		System.out.println(test_1.matches(test_2));
	}
}
