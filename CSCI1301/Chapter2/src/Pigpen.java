// We use import statements to use packages.
// Note that this is NOT the same as a "package" statement.
import java.util.Scanner;

public class Pigpen {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// This is a comment.  Everything after "//" is ignored 
		// Variables are given types, names, and values
		System.out.print("Enter the width: \t");
		int width = scan.nextInt();
		int length = 5;
		int numPigs = 12;

		// Declaration
		String currentMonth;

		// Assignment statement

		currentMonth = "August";

		// Compute some statistics
		int area = width * length;
		int perimeter = 2 * (length + width);

		// Suppose a pig needs 10 square feet to live comfortably.
		// How do we know if our pen is big enough?
		double areaNeeded = 10 * numPigs;

		// The boolean data type expresses whether a statement is:
		// TRUE or FALSE

		boolean haveEnoughSpace = areaNeeded <= area;
		//System.out.println(haveEnoughSpace);

		// By convention, we care about indentation.
		// How do we know how far to indent?
		// Once per every curly brace opened
		// Can fix this with Cmd+I

		// Write farm information to the screen

		System.out.println("Area = " + area);
		System.out.print("Perimeter = " );
		System.out.println(perimeter);

		System.out.println("Space we need: " + areaNeeded);
		System.out.println("We have enough space: " + haveEnoughSpace);

		// System.out.println("2 + 2 = " + (2+2));
		// Adds the 2s to empty strings
		// System.out.println("2 + 2 = " + ("" + 2) + ("" + 2));
		
		String format = "Area = %.2f\n";
		System.out.printf(format, areaNeeded);
	}
}
