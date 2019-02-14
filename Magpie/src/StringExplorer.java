/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */


public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "the quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		int positionThe = sample.indexOf("the");
		System.out.println("sample.indexOf(\"the\") = " + positionThe);
		
		int positionThe_FromIndex = sample.indexOf("the", 5);
		System.out.println("sample.indexOf(\"the\", 5) = " + positionThe_FromIndex);
	}
}
