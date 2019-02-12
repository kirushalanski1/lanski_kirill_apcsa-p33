//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a ) {
	String vowels = "AEIOUaeiou";
	String str = a;
	char char_first = str.charAt(0);
	char char_last = str.charAt(str.length()-1);
	   
	for (int i = 0; i < vowels.length(); i++) {
		if (char_first == vowels.charAt(i) || char_last == vowels.charAt(i)) {
			return "yes";
		}
	}
	return "no";
	}
}