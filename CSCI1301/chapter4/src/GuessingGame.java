import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 1301;
		int guess = -1;


		/*
		System.out.print("Enter a number: ");
		int guess = scan.nextInt();

		boolean hasWon = (guess == answer);

		while (!hasWon) {
			if (guess < answer) {
				System.out.println("Too low.");

			}
			else {
				System.out.println("Too high.");
			}

			System.out.print("Enter a number: ");
			guess = scan.nextInt();
			hasWon = guess == answer;



		}
		 */

		boolean hasWon = false;

		do {
			System.out.println("Enter a number: ");
			guess = scan.nextInt();
			if (guess < answer) {
				System.out.println("Too low.");

			}
			else if (guess > answer){
				System.out.println("Too high.");
			}
			else {
				System.out.println("You win!");
				hasWon = true;
			}

		} while(!hasWon);


		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int j = 1;
		while (j <= 100) {
			System.out.println(j);
			j++;
		}
		
		/* while (!hasWon) {
			System.out.print("Enter a number: ");
			guess = scan.nextInt();
			if(guess < answer) {
				System.out.println("Too low.");
			}
			else if (guess > answer){
				System.out.println("Too high.");
			}
			else {
				System.out.println("You win!");
				hasWon = true;
			}

		}
		 */

	}

}
