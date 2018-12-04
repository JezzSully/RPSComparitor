package rpsv2;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	//1 rock
	//2 paper
	static Random r = new Random();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		RPS myRPS = new RPS();
		
		for(int i = 0; i < 10; i++)
		{
			myRPS.play();
		}
		
		int playerwins = myRPS.getPlayerwins();
		int draws = myRPS.getDraws();
		int compwins = myRPS.getCompwins();

		
		System.out.println("Player wins: " + playerwins);
		System.out.println("Draws: " + draws);
		System.out.println("Comp wins: " + compwins);
	}	
}
