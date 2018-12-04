package rpsv2;

import java.util.Comparator;

public class RPSComparitor implements Comparator<Integer> {

	@Override
	public int compare(Integer pChoice, Integer cChoice) {
		int result = 300;

		if (pChoice == 1) {
			System.out.println("Player chooses Rock.");
			if (cChoice == 1) {
				System.out.println("Computer chooses Rock");
				result = 0;// draw
				System.out.println("It's a draw.");

			}
			if (cChoice == 2) {
				System.out.println("Computer chooses Paper.");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 3) {
				System.out.println("Computer chooses Scissors");

				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 4) {
				System.out.println("Computer chooses Lizard");

				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 5) {
				System.out.println("Computer chooses Spock");

				result = 1;
				System.out.println("Computer Wins.");

			}
		}
		if (pChoice == 2) {
			System.out.println("Player chooses Paper.");

			if (cChoice == 1) {
				System.out.println("Computer chooses Rock");
				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 2) {
				System.out.println("Computer chooses Paper.");

				result = 0;
				System.out.println("It's a draw.");

			}
			if (cChoice == 3) {
				System.out.println("Computer chooses Scissors");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 4) {
				System.out.println("Computer chooses Lizard");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 5) {
				System.out.println("Computer chooses Spock");

				result = -1;
				System.out.println("Player Wins.");

			}
		}
		if (pChoice == 3) {
			System.out.println("Player chooses Scissors");

			if (cChoice == 1) {
				System.out.println("Computer chooses Rock");
				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 2) {
				System.out.println("Computer chooses Paper.");

				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 3) {
				System.out.println("Computer chooses Scissors");

				result = 0;
				System.out.println("It's a draw.");

			}
			if (cChoice == 4) {
				System.out.println("Computer chooses Lizard");

				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 5) {
				System.out.println("Computer chooses Spock");

				result = 1;
				System.out.println("Computer Wins.");

			}
		}
		if (pChoice == 4) {
			System.out.println("Player chooses Lizard");

			if (cChoice == 1) {
				System.out.println("Computer chooses Rock");
				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 2) {
				System.out.println("Computer chooses Paper.");

				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 3) {
				System.out.println("Computer chooses Scissors");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 4) {
				System.out.println("Computer chooses Lizard");

				result = 0;
				System.out.println("It's a Draw.");

			}
			if (cChoice == 5) {
				System.out.println("Computer chooses Spock");

				result = -1;
				System.out.println("Player Wins.");

			}
		}
		if (pChoice == 5) {
			System.out.println("Player chooses Spock");

			if (cChoice == 1) {
				System.out.println("Computer chooses Rock");
				result = -1;
				System.out.println("Player Wins.");

			}
			if (cChoice == 2) {
				System.out.println("Computer chooses Paper.");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 3) {
				System.out.println("Computer chooses Scissors");

				result = -1;
				System.out.println("Player Wins");

			}
			if (cChoice == 4) {
				System.out.println("Computer chooses Lizard");

				result = 1;
				System.out.println("Computer Wins.");

			}
			if (cChoice == 5) {
				System.out.println("Computer chooses Spock");

				result = 0;
				System.out.println("It's a Draw.");

			}
		}
		return result;
	}
}