//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int even_2 = -1;
		int odd = -1;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1) {
				odd = i;
				for (int j = odd + 1; j < ray.length; j++) {
					if (ray[j] % 2 == 0) {
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