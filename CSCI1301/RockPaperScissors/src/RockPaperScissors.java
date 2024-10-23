/*
 * RockPaperScissors.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  10/4/2024
 *
 * This lab takes a users input for how many points
 * to win against a computer in rock, paper, scissors. 
 * Then the user can input either move and win or lose after
 * the amount of rounds ended. This lab focuses on topics 
 * like while loops and if statements. 
 * 
 * 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */

// imports scanner module
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// creates scanner object to take in user input
		Scanner scan = new Scanner(System.in);

		// stores necessary variables to calculate wins and moves
		int userPoints = 0;
		int computerPoints = 0;
		String userMove = "";
		String computerMove = "";

		System.out.print("Points to win: ");
		int pointsToWin = scan.nextInt();


		// while loop to make test if the game is over or not
		while(userPoints < pointsToWin && computerPoints < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = scan.next().trim().toLowerCase();

			// while loop to make sure that the user is entering valid responses
			while(!userMove.toLowerCase().equals("rock") && !userMove.toLowerCase().equals("paper") && !userMove.toLowerCase().equals("scissors")) {
				System.out.print("Rock, paper, or scissors? ");
				userMove = scan.next().trim().toLowerCase();
			}

			// gets the computer move based on code from the other file
			computerMove = ComputerOpponent.getMove();

			System.out.print(", ");

			// tests to see if the user and computer have the same move
			if(userMove.equals(computerMove)) {
				System.out.printf("so it's a tie. (%d-%d)\n", userPoints, computerPoints);
			}
			// tests to see if the user wins the point
			else if((userMove.toLowerCase().equals("rock") && computerMove.equals("scissors")) || (userMove.toLowerCase().equals("scissors") && computerMove.equals("paper")) ||  (userMove.toLowerCase().equals("paper") && computerMove.equals("rock"))){
				userPoints++;
				System.out.printf("so you win! (%d-%d)\n", userPoints, computerPoints);
			}
			else {
				// else the computer wins the point
				computerPoints++;
				System.out.printf("so you lose. (%d-%d)\n", userPoints, computerPoints);
			}
		}
		
		// if statement to tests who wins

		if(userPoints > computerPoints) {
			System.out.println("Congratulations! You won!");

		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}

}
