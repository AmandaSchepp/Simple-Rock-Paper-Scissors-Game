import java.util.Random;
import java.util.*;
import java.util.Scanner;

/*
 * Name: Amanda Schepp
 * Program: Basic Rock Paper Scissors Game.
 * Created: 2022-04-29
 * Updated: 2022-04-29
 */
public class RockPaperScissors
{
	public static int playerScore = 0;
	public static int compScore = 0;
	public static int draws = 0;
	public static int numGames = 0;

	public static void main(String[] args)
	{
		System.out.println("Welcome to Rock Paper Scissors, think you can beat me?");
		System.out.println("\nRules and How to Play:");
		System.out.println("-Enter \"s\" to see the current score");
		System.out.println("\n-Enter \"x\" to reset the score");
		System.out.println("\n-Enter \"q\" to end the game");
		System.out.println("\n-Enter you play (Rock Paper or Scissors) to play a turn");

		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.println("\nEnter your move:  ");
			String input = scan.nextLine();

			int compPlay = (int)(Math.random() * 3);

			if(input.equals("s") || input.equals("S"))
			{
				System.out.println(printScore());
			}
			else if(input.equals("x") || input.equals("X"))
			{
				RockPaperScissors.playerScore = 0;
				RockPaperScissors.compScore = 0;
				RockPaperScissors.draws = 0;

				System.out.println("SCORE RESEST TO 0\n");
			}
			else if(input.equals("q") || input.equals("Q"))
			{
				break;
			}
			else if(input.equalsIgnoreCase("rock"))
			{
				if(compPlay == 0)
				{
					RockPaperScissors.draws++;
					System.out.println("\nTIE");
				}
				else if(compPlay == 1)
				{
					RockPaperScissors.compScore++;
					System.out.println("\nLOSS");
				}
				else if(compPlay == 2)
				{
					RockPaperScissors.playerScore++;
					System.out.println("\nWIN");
				}
			}
			else if(input.equalsIgnoreCase("paper"))
			{
				if(compPlay == 0)
				{
					RockPaperScissors.playerScore++;
					System.out.println("\nWIN");
				}
				else if(compPlay == 1)
				{
					RockPaperScissors.draws++;
					System.out.println("\nTIE");
				}
				else if(compPlay == 2)
				{
					RockPaperScissors.compScore++;
					System.out.println("\nLOSS");
				}
			}
			else if(input.equalsIgnoreCase("scissors"))
			{
				if(compPlay == 0)
				{
					RockPaperScissors.compScore++;
					System.out.println("\nLOSS");
				}
				else if(compPlay == 1)
				{
					RockPaperScissors.playerScore++;
					System.out.println("\nWIN");
				}
				else if(compPlay == 2)
				{
					RockPaperScissors.draws++;
					System.out.println("\nTIE");
				}
			}
			else
			{
				System.out.println("Invalid input, Please try again!");
			}
		}
	}

	/**
	* Prints the current score of the game.
	*
	* returns the score in a nice string format.
	**/
	public static String printScore()
	{
		RockPaperScissors.numGames = RockPaperScissors.playerScore + RockPaperScissors.compScore + RockPaperScissors.draws;
		String score = ("The Players Points: " + RockPaperScissors.playerScore +
						"\nThe Computers Points: " + RockPaperScissors.compScore +
						"\nThe Total Number of Draws: " + RockPaperScissors.draws +
						"\nThe Total Number of Games Played: " + RockPaperScissors.numGames);
		return score;
	}
}