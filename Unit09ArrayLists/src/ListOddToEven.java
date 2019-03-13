//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int even_2 = -1;
		int odd = -1;
		
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 1) {
				odd = i;
				for (int j = ray.size()-1; j > odd; j--) {
					if (ray.get(j) % 2 == 0) {
						even_2 = j;
						break;
					}
				}
				break;
				}
			}
		
		if (odd == -1 || even_2 == -1) {
			return -1;
		}
		return even_2 - odd;
	}
}