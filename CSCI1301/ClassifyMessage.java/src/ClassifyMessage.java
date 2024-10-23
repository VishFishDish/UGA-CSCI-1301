/*
 * ClassifyMessage.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  September 18, 2024
 *
 * This program takes in a user's inputted tweet and categorizes 
 * it based on a created enumeration. This tweet's data is stored into variables
 * and is outputed based on various parts such as latitude and longitude.
 * This program tackles concepts learned such as enumerations and if-else statements.
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

import java.util.Scanner;

public class ClassifyMessage {

	// Declares the enumeration
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {

		// Creates object to take user input
		Scanner scan = new Scanner(System.in);

		final double south = 39.882343;  // southernmost latitude
		final double north = 40.231315;  // northernmost latitude
		final double west = -105.743511; // westernmost longitude
		final double east = -104.907864; // easternmost longitude

		String catString; 	// The raw text of the message's category
		String payload; 	// The primary content of the message
		double latitude; 	// The latitue indicated in the message
		double longitude; 	// the longitude indicated in the message
		boolean isInRange; 	// A "flag indicating whether the latitude and longitude values are within bounds
		MessageCategory category; 	// The message's category

		// Takes user input for the tweet and stores values to variables and trims the tweet
		System.out.println("Please enter a formatted message:");
		catString = scan.next();
		catString.trim();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine();
		payload.trim();

		// Conditions to categorize the tweets
		if ((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke"))){
			category = MessageCategory.ALERT;
		}
		else if(catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}

		// Conditions to check if the longitude and latitude are in range
		if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}

		// Prints and formats the stored information
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);
	}
}

