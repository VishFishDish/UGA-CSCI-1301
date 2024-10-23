/*
 * ParseTheTweet.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  September 12, 2024
 *
 * This program takes in a tweet as user input and extracts specific details related to the tweet and outputs
 * them. This program takes into account concepts and methods learned in class such as
 * ".trim()" and ".substring()". 
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



// Imports the scanner class
import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {

		// Creates object allowing user input
		Scanner scan = new Scanner(System.in);

		// Creates constant variables holding the tweet tags
		final String typeTag = "#typ";
		final String detailTag = "#det";
		final String locationTag = "#loc";
		final String latitudeTag = "#lat";
		final String longitudeTag = "#lng";

		// Initializes integer variables for substring
		int start;
		int finish;

		// Prompts user input
		System.out.println("Enter a tweet below");
		String tweet = scan.nextLine();

		// Extracts information for the type
		start = tweet.indexOf(typeTag) + 4;
		finish = tweet.indexOf("; #det");
		String type = tweet.substring(start, finish);
		type.trim();

		// Extracts information for the detail
		start = tweet.indexOf(detailTag) + 4;
		finish = tweet.indexOf("; #loc");
		String detail = tweet.substring(start, finish);
		detail = detail.replace(",", "-");
		detail.trim();

		// Extracts information for the location
		start = tweet.indexOf(locationTag) + 4;
		finish = tweet.indexOf("; #lat");
		String location = tweet.substring(start, finish);
		location = location.replace(",", "-");
		location.trim();


		// Extracts information for the latitude
		start = tweet.indexOf(latitudeTag) + 4;
		finish = tweet.indexOf("; #lng");
		String latitude = tweet.substring(start, finish);
		latitude.trim();

		//Extracts information for the longitude
		start = tweet.indexOf(longitudeTag) + 4;
		finish = tweet.indexOf(";\"");
		String longitude = tweet.substring(start, finish);
		longitude.trim();


		// Formats and prints all the extracted information
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);


	}

}
