/*
 * StringFun.java
 * Author:  Vishnu Nachimuthu
 * Submission Date:  October 18, 2024
 *
 * This program allows the user to manipulate a string based off
 * the given commands. They are able to reverse the string, replace a first or last
 * occurance of a letter, remove a specific letter, or remove a specific instance of a 
 * letter. The program takes into account topics learned such as string manipulation, 
 * methods, and parameters.
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

// Imports Scanner to take in user input
import java.util.Scanner;

public class StringFun {
	
	// Method to reverse the input string
	public static String reverse(String input) {
		int length = input.length();
		String newMessage = "";
		// Loop through the string backwards and build the reversed string
		for(int i = length - 1; i >= 0; i--) {
			newMessage += input.charAt(i);
		}
		return newMessage;
	}
	
	// Method to replace the first occurrence of a character in the input string
	public static String replaceFirst(String input, char replace, char newChar) {
		int length = input.length();
		String newMessage = "";
		boolean replaced = false;
		// Loop through the string and replace the first occurrence of the character
		for(int i = 0; i < length; i++) {
			if(input.charAt(i) == replace && !replaced) {
				newMessage += newChar;
				replaced = true;
			} else {
				newMessage += input.charAt(i);
			}
		}
		// If the character was not found, print a message
		if(!replaced) {
			System.out.println("The letter was not found in the word.");
		}
		return newMessage;
	}
	
	// Method to replace the last occurrence of a character in the input string
	public static String replaceLast(String input, char replace, char newChar) {
		int length = input.length();
		String newMessage = "";
		boolean replaced = false;
		// Loop through the string backwards to find the last occurrence of the character
		for(int i = length - 1; i >= 0; i--) {
			if(input.charAt(i) == replace && !replaced) {
				// Replace the character and stop the loop
				newMessage = input.substring(0, i) + newChar + input.substring(i + 1);
				replaced = true;
			}
		}
		// If the character was not found, print a message
		if(!replaced) {
			System.out.println("The letter was not found in the word.");
		}
		return newMessage;
	}
	
	// Method to remove all occurrences of a character in the input string
	public static String removeAll(String input, char remove) {
	    int length = input.length();
	    String newMessage = "";
	    int count = 0;

	    // Count the number of occurrences of the character to be removed
	    for (int i = 0; i < length; i++) {
	        if (input.charAt(i) == remove) {
	            count++;
	        }
	    }

	    // If the character is not found, print an error message
	    if (count == 0) {
	        System.out.println("Error: the letter you are trying to remove does not exist");
	        return input;
	    }

	    // Build a new string without the character to be removed
	    for (int i = 0; i < length; i++) {
	        if (input.charAt(i) != remove) {
	            newMessage += input.charAt(i);
	        }
	    }

	    return newMessage;
	}

	// Method to remove a specific occurrence of a character in the input string
	public static String remove(String input, char remove, int index) {
	    int length = input.length();
	    String newMessage = "";
	    int count = 0;
	    int indexToRemove = -1;
	    
	    // Find the position of the specified occurrence of the character
	    for(int i = 0; i < length; i++) {
	    	if(input.charAt(i) == remove) {
	    		count++;
	    		if(count == index) {
	    			indexToRemove = i;
	    		}
	    	}
	    }
	    
	    // If the character is found, remove it and build the new string
	    if(indexToRemove != -1) {
	    	newMessage = input.substring(0, indexToRemove) + input.substring(indexToRemove + 1);
	    	return newMessage;
	    } else {
            // If the character is not found, print an error message
            System.out.println("Error: the letter you are trying to remove does not exist");
            return input;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String input = scan.nextLine();
		boolean isRunning = true;
		
		// Loop to keep the program running until the user chooses to quit
		while(isRunning) {
			System.out.println("Enter your command (reverse, replace first, replace last, remove, remove all, quit)");
			String command = scan.nextLine();
			
			// Validate the command entered by the user
			if(!command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("remove all") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("remove")) {
				System.out.println("Command invalid. Try again");
			} else {
				// If the user chooses to quit, exit the loop
				if(command.equalsIgnoreCase("quit")) {
					isRunning = false;
				} else {
					// Execute the command based on user input and calls each method
					if(command.equalsIgnoreCase("reverse")) {
						input = reverse(input);
						System.out.println("The new sentence is: " + input);
					} else if(command.equalsIgnoreCase("replace first")) {
						System.out.println("Enter the character to replace");
						char replace = scan.nextLine().charAt(0);
						System.out.println("Enter the new character");
						char newChar = scan.nextLine().charAt(0);
						input = replaceFirst(input, replace, newChar);
						System.out.println("The new sentence is: " + input);
					} else if(command.equalsIgnoreCase("replace last")) {
						System.out.println("Enter the character to replace");
						char replace = scan.nextLine().charAt(0);
						System.out.println("Enter the new character");
						char newChar = scan.nextLine().charAt(0);
						input = replaceLast(input, replace, newChar);
						System.out.println("The new sentence is: " + input);
					} else if (command.equalsIgnoreCase("remove")) {
					    System.out.println("Enter the character to remove");
					    char remove = scan.nextLine().charAt(0);
					    System.out.println("Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
					    int index = scan.nextInt();
					    scan.nextLine();

					    String updatedInput = remove(input, remove, index);
					    System.out.println(updatedInput);
					    if (!updatedInput.equals(input)) {
					        input = updatedInput;
					        System.out.println("The new sentence is: " + input);
					    }
					} else if(command.equalsIgnoreCase("remove all")) {
						System.out.println("Enter the character to remove");
						char remove = scan.nextLine().charAt(0);
						String updatedInput = removeAll(input, remove);
						if (!updatedInput.equals(input)) {
	                        input = updatedInput;
	                        System.out.println("The new sentence is:" + input);
	                    }
					}
				}
			}
		}
	}
}
