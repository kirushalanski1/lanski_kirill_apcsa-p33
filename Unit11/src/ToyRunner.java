//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy teddybear = new Toy("teddybear");
		teddybear.setCount(5);
		System.out.println(teddybear);
		
		Toy doll = new Toy("doll");
		doll.setCount(3);
		System.out.println(doll);
		
	}
}