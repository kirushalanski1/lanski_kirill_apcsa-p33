//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("rock");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double rand = Math.floor((Math.random() * 3) + 1);
		if (rand == 0) compChoice = "rock";
		if (rand == 1) compChoice = "paper";
		if (rand == 2) compChoice = "scissors";
	}

	public String determineWinner()
	{
		
		String winner="";
		if (compChoice.equals("rock") && playChoice.equals("scissors") || compChoice.equals("paper") && playChoice.equals("rock") || compChoice.equals("scissors") && playChoice.equals("paper")) winner = "computer";
		else if (compChoice.equals(playChoice)) winner = "draw";
		else winner = "player";
		return winner;
	}

	public String toString()
	{
		String output = "";
		if (determineWinner().equals("computer")) {
			output = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Computer wins, " + compChoice + " beats " + playChoice;
		}
		else if (determineWinner().equals("player")) {
			output = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Player wins, " + playChoice + " beats " + compChoice;
		}
		else if (determineWinner().equals("draw")) {
			output = "Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n" + "Draw!";
		}
		return output;
	}
}