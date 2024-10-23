/*
 * NetPay.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  August 29, 2024
 *
 * This program takes the number of hours a user has worked in a week and makes calculations to print out their 
 * gross and net pay along with any deductions made to various causes. This program incorporates skills such as
 * using scanner to take in user input, variable types, along with formatting print statements. 
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

//Imports module allowing for user input
import java.util.Scanner;

public class NetPay {
	public static void main(String[] args) {

		//Creates object allowing user input
		Scanner scan = new Scanner(System.in);

		//Creates constant variables for fixed values
		final double fedTax = 10.00;
		final double stateTax = 4.5;
		final double ssPercent = 6.2;
		final double medPercent = 1.45;
		final double payByHour = 7.25;

		//Prints out dialogue prompting user input
		System.out.println("How many hours did you work?");
		System.out.print("Hours per Week:\t\t");

		//Takes the number of hours worked per week through user input 
		int hours = scan.nextInt();


		//Initializes variables to be modified
		double grossPay;
		double netPay;
		double federal;
		double state;
		double ss;
		double med;

		//Calculations to get correct values for variables
		grossPay = hours * payByHour;
		federal = (grossPay * fedTax) / 100;
		state = (grossPay * stateTax) / 100;
		ss = (grossPay * ssPercent) / 100;
		med = (grossPay * medPercent) / 100;
		netPay = (grossPay - federal - state - ss - med);

		/*Prints and formats the console to accurately display the information 
		  and corresponding variables
		 */

		System.out.println("Gross Pay:\t	" + grossPay);
		System.out.println("Net Pay:\t	" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t	" + federal);
		System.out.println("State:\t		" + state);
		System.out.println("Social Security:   \t" + ss);
		System.out.println("Medicare:	\t" + med);


	}
}
