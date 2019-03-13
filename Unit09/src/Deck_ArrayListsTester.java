
public class Deck_ArrayListsTester {

	public static void main (String args[]) {
		
		Deck_ArrayLists test_1 = new Deck_ArrayLists(new String[] {"jack", "queen", "king"}, new String[] {"blue", "red"}, new int[] {11, 12, 13});
		test_1.deal();
		System.out.println(test_1);
		test_1.shuffle();
		System.out.println(test_1);
		System.out.println(test_1.isEmpty());
	}
}
