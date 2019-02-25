//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			
	
		String player = "";
		do {
			out.print("Rock-Paper-Scissors - pick your weapon [Rock,Paper,Scissors] :: ");
			
			player = keyboard.nextLine();
		
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(player);
			out.println(game);
			
			out.println("Play again? [y/n]");
			response = keyboard.nextLine().charAt(0);
		} while (response != ('n'));

	}
}



