//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		if (numArray.size() == 1) return true;
		
		int sum = 0;
		for (int i = 0; i < numArray.size()-1; i++) {
			if (numArray.get(i) > numArray.get(i+1)) sum++;
		}
		
		if (sum + 1 == numArray.size())return true;
		else return false;
	}	
}