/*
 * PayoffDebt.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  September 6, 2024
 *
 * This program allows the user to input their principal payment, annual interest rate, and their monthly payment
 * to output the number of months they need to pay it off, the total amount paid, the total interest paid, and the 
 * overpayment that has been made in total. This program takes into account new concepts that I learned such as 
 * printf statements and using the Java Math class. 
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


// Imports module allowing for user input
import java.util.Scanner;

public class PayoffDebt {

	public static void main(String[] args) {

		// Creates object allowing user input
		Scanner scan = new Scanner(System.in);

		// Initializes variables the user inputs
		double principal;
		double interest_rate;
		double monthly_payment;

		// Stores all the information the user inputs
		System.out.print("Principal:\t\t\t");
		principal = scan.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		interest_rate = scan.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthly_payment = scan.nextDouble();
		System.out.println();

		// Variables and equations to calculate the number of months needed
		double log_monthly_pay = Math.log(monthly_payment);
		double log_numerator = Math.log((monthly_payment - (interest_rate / 1200.0) * principal));
		double log_denominator = Math.log((interest_rate / 1200.0) + 1.0);
		double raw_months_needed = ((log_monthly_pay - log_numerator) / log_denominator);

		// Accurately displays the number of months as an integer
		double months_ceiling = Math.ceil(raw_months_needed);
		int months_needed = (int) months_ceiling;

		// Calculates the raw amount and interest paid and makes sure they are positive
		double amount_paid = months_needed * monthly_payment;
		double interest_paid = (principal - amount_paid) * -1;

		// Creates the variables calculating the overpayment
		/* 
		 * Overpayment psuedocode: 
		 * 1. double overpaid amount = the raw months times the monthly payment
		 * 2. double overpaid interest = -1 times (principal minus overpaid amt)
		 * 3. double overpayment = interest minus overpaid interest
		 * 4. round (overpayment times 100)
		 * 5. int overpayment_2 = (int) overpayment and double overpayment_3 = (double) overpayment_2
		 * 6. overpayment divided by 100
		 * 
		 */

		double overpaid_amount = raw_months_needed * monthly_payment;
		double overpaid_interest = (principal - overpaid_amount) * -1;
		double overpayment = interest_paid - overpaid_interest;

		// Modifies the format for the amount and interest paid and casts it to integers
		amount_paid *= 100;
		interest_paid *= 100;
		int num_amount_paid = (int) amount_paid;
		int num_interest_paid = (int) interest_paid;

		// Creates and casts the variables to doubles
		double dec_amount_paid = (double) num_amount_paid;
		double dec_interest_paid = (double) num_interest_paid;

		// Formats the amount and interest paid to dollar format
		dec_amount_paid /= 100;
		dec_interest_paid /= 100;

		// Rounds overpayment
		overpayment = Math.round(overpayment * 100);

		// Casts the overpayment to a whole number then back to a double to include decimals
		int num_overpayment = (int) overpayment;
		double dec_overpayment = (double) num_overpayment;

		// Formats the overpayment back to proper dollars
		dec_overpayment /= 100;

		// Prints and formats the information and includes 2 decimal points for the dollars
		String formatAmt = "Total Amount Paid:\t\t$%.2f\n";
		String formatIntr = "Total Interest Paid:\t\t$%.2f\n";
		String formatOver = "Overpayment:\t\t\t$%.2f\n";
		System.out.println("Months Needed To Pay Off:\t" + months_needed);
		System.out.printf(formatAmt, dec_amount_paid);
		System.out.printf(formatIntr, dec_interest_paid);
		System.out.printf(formatOver, dec_overpayment);



	}

}
