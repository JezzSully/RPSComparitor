package rpsv2;

import java.util.Random;
import java.util.Scanner;

public class RPS 
{
	int compwins = 0;
	int playerwins = 0;
	int draws = 0;
	private Scanner scan = new Scanner(System.in);
	
	Random r = new Random();
	
	RPSComparitor rpsc = new RPSComparitor();
	
	public void play()
	{
		int pChoice = getPlayerChoice();
		int cChoice = getCompChoice();
		
		int myint = rpsc.compare(pChoice, cChoice);
		
		if(myint == 1)
		{
			compwins++;
		}
		else if(myint == 0)
		{
			draws++;
		}
		else if(myint == -1)
		{
			playerwins++;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public int getPlayerChoice()
	{	
		System.out.println("");
		System.out.println("Select a weapon.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("4. Lizard");
		System.out.println("5. Spock");
		System.out.print("Player1: ");
		return scan.nextInt();
	}
	
	public int getCompwins() {
		return compwins;
	}

	public void setCompwins(int compwins) {
		this.compwins = compwins;
	}

	public int getPlayerwins() {
		return playerwins;
	}

	public void setPlayerwins(int playerwins) {
		this.playerwins = playerwins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getCompChoice()
	{
		return r.nextInt(5) + 1;
	}
}
