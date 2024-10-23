import java.util.Scanner;

public class TextAdventure {
	public static void main(String[] args) {
		System.out.println("Adventure begins!");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("There is a note in the room, "
				+ "and there is a single exit ahead.");
		
		System.out.println("Do you want to \"read note\" or "
				+ "\"move ahead\"?");
		
		String choice = scan.nextLine();
		boolean willReadNote = (choice.equals("read note"));
		
		if (willReadNote) {
			System.out.println("The note reads, \"Red fish, blue fish\".");
			
		}
		System.out.println();
		System.out.println("The door shuts behind you and locks!");
		System.out.println("There is a keypad at the end of the room.");
		
		System.out.println("You see an aquarium in the center of the room.");
		System.out.println("There are 8 red fish, " +
					"12 green fish, " +
					"15 blue fish, " +
					"and 23 yellow fish.");
		int userCode = 0;
		int actualCode = 815;
		int userCodeLength = String.valueOf(userCode).length();
		
		System.out.println("You have no choice. What is the code?: ");
		userCode = scan.nextInt();
		
		// Keypad constrains:
		// 1. Numbers must be non-negative
		// 2. Numbers cannot exceed 3 digits in length
		
		if((userCode >= 0) && (userCodeLength < 4)) {
			System.out.println("TODO: Check that the code is right...\n");
			
			if(userCode == actualCode) {
				System.out.println("Correct Code");
			}
			
			else {
				System.out.println("Incorrect Code");
			}
		}
		
		else {
			System.out.println("How did you even do this?");
		}
		
		
		System.out.println("\nAdventure ends");
		
		
		
	}
}
