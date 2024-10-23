/*
 * GradeCalculator.java
 * Author:  Vishnu Nachimuthu 
 * Submission Date:  10/4/2024
 *
 * The purpose of this project is to allow a user to 
 * enter in the grade that they hope to get in a class.
 * They are also supposed to enter all the weights of their 
 * exams and assignments along with their scores to calculate
 * if they can get their desired grade or not, or what they 
 * would need to get that grade. This takes into account topics we 
 * covered such as formatting strings and if statements.
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


// imports java module
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // creates scanner object to use
    	Scanner scan = new Scanner(System.in);

    	// formatting the print statements
        System.out.println("Grading Scale:");
        System.out.println("A\t 90 - 100");
        System.out.println("B\t 80 - 89");
        System.out.println("C\t 70 - 79");
        System.out.println("D\t 60 - 69");
        System.out.println("F\t below 60");
        System.out.print("What letter grade do you want to achieve for the course?");

        // stores the desired grade and tests to make sure its a valid letter
        char desiredGrade = scan.next().toUpperCase().charAt(0);
        if (desiredGrade != 'A' && desiredGrade != 'B' && desiredGrade != 'C' && desiredGrade != 'D' && desiredGrade != 'F') {
            System.out.print("The input is invalid.");
            System.exit(0);
        }

        // formatting the print statements and storing each of the weights
        System.out.println("Enter percentage weights below.");
        System.out.print("Exam 1:\t\t");
        int exam1Weight = scan.nextInt();
        System.out.print("Exam 2:\t\t");
        int exam2Weight = scan.nextInt();
        System.out.print("Final Exam:\t");
        int finalExamWeight = scan.nextInt();
        System.out.print("Labs:\t\t");
        int labWeight = scan.nextInt();
        System.out.print("Projects:\t");
        int projectWeight = scan.nextInt();
        System.out.print("Participation:\t");
        int participationWeight = scan.nextInt();
        System.out.print("Quizzes:\t");
        int quizWeight = scan.nextInt();

        // tests to make sure the weights are valid and add up to 100
        if (exam1Weight + exam2Weight + finalExamWeight + labWeight + projectWeight + participationWeight + quizWeight != 100) {
            System.out.print("Weights don't add up to 100, program exiting...");
            System.exit(0);
        }

        // tests to see if user knows the scores and stores them
        System.out.print("Do you know your exam 1 score?");
        String knowExam1 = scan.next();
        int exam1Score = -1;
        if (knowExam1.equalsIgnoreCase("yes") || knowExam1.equalsIgnoreCase("y")) {
            System.out.print("Score received on exam 1:");
            exam1Score = scan.nextInt();
        }

        int exam2Score = -1;
        if (exam1Score != -1) {
            System.out.print("Do you know your exam 2 score?");
            String knowExam2 = scan.next();
            if (knowExam2.equalsIgnoreCase("yes") || knowExam2.equalsIgnoreCase("y")) {
                System.out.print("Score received on exam 2:");
                exam2Score = scan.nextInt();
            }
        }

        int finalExamScore = -1;
        if (exam2Score != -1) {
            System.out.print("Do you know your final exam score?");
            String knowFinalExam = scan.next();
            if (knowFinalExam.equalsIgnoreCase("yes") || knowFinalExam.equalsIgnoreCase("y")) {
                System.out.print("Score received on final exam:");
                finalExamScore = scan.nextInt();
            }
        }

        System.out.print("Do you know your lab average?");
        String knowLabAvg = scan.next();
        int labAvg = -1;
        if (knowLabAvg.equalsIgnoreCase("yes") || knowLabAvg.equalsIgnoreCase("y")) {
            System.out.print("Average lab grade:");
            labAvg = scan.nextInt();
        }

        System.out.print("Do you know your project average?");
        String knowProjectAvg = scan.next();
        int projectAvg = -1;
        if (knowProjectAvg.equalsIgnoreCase("yes") || knowProjectAvg.equalsIgnoreCase("y")) {
            System.out.print("Average project grade:");
            projectAvg = scan.nextInt();
        }

        System.out.print("Do you know your participation average?");
        String knowParticipationAvg = scan.next();
        int participationAvg = -1;
        if (knowParticipationAvg.equalsIgnoreCase("yes") || knowParticipationAvg.equalsIgnoreCase("y")) {
            System.out.print("Average participation grade:");
            participationAvg = scan.nextInt();
        }

        System.out.print("Do you know your quiz average?");
        String knowQuizAvg = scan.next();
        int quizAvg = -1;
        if (knowQuizAvg.equalsIgnoreCase("yes") || knowQuizAvg.equalsIgnoreCase("y")) {
            System.out.print("Average quiz grade:");
            quizAvg = scan.nextInt();
        }

        // creates new variables for the score and weight
        double currentScore = 0;
        double totalKnownGradeWeight = 0;

        
        // if statements to test if the scores were entered and if they were add them to current score and
        // add the weight
        if (exam1Score != -1) {
            currentScore += exam1Weight * exam1Score;
            totalKnownGradeWeight += exam1Weight;
        }
        if (exam2Score != -1) {
            currentScore += exam2Weight * exam2Score;
            totalKnownGradeWeight += exam2Weight;
        }
        if (finalExamScore != -1) {
            currentScore += finalExamWeight * finalExamScore;
            totalKnownGradeWeight += finalExamWeight;
        }
        if (labAvg != -1) {
            currentScore += labWeight * labAvg;
            totalKnownGradeWeight += labWeight;
        }
        if (projectAvg != -1) {
            currentScore += projectWeight * projectAvg;
            totalKnownGradeWeight += projectWeight;
        }
        if (participationAvg != -1) {
            currentScore += participationWeight * participationAvg;
            totalKnownGradeWeight += participationWeight;
        }
        if (quizAvg != -1) {
            currentScore += quizWeight * quizAvg;
            totalKnownGradeWeight += quizWeight;
        }

        if (totalKnownGradeWeight > 0) {
            currentScore = currentScore / totalKnownGradeWeight;
            System.out.printf("Current grade score:%.2f\n", currentScore);
        }
              

        // if statements to store the current letter grade based on what the current score is
        char currentLetterGrade = 'F';

        if (currentScore >= 90.0) {
            currentLetterGrade = 'A';
        } else if (currentScore >= 80.0 && currentScore < 90.0) {
            currentLetterGrade = 'B';
        } else if (currentScore >= 70.0 && currentScore < 80.0) {
            currentLetterGrade = 'C';
        } else if (currentScore >= 60.0 && currentScore < 70.0) {
            currentLetterGrade = 'D';
        }
        else {
        	currentLetterGrade = 'F';
        }

        System.out.println("Your current letter grade:" + currentLetterGrade);

        // if statements to store the final overall score based on what the desired grade is
        double finalOverallScore = 0;
        
        if(desiredGrade == 'A') {
        	finalOverallScore = 90.0;
        }
        else if(desiredGrade == 'B') {
        	finalOverallScore = 80.0;
        }
        else if(desiredGrade == 'C') {
        	finalOverallScore = 70.0;
        }
        else if(desiredGrade == 'D') {
        	finalOverallScore = 60.0;
        }
        else if(desiredGrade == 'F') {
        	finalOverallScore = 0.0;
        }

       
        // boolean to make sure that all the exam scores are known
        boolean allScoresKnown = (exam1Score != -1 && exam2Score != -1 && finalExamScore != -1 && labAvg != -1 && projectAvg != -1 && participationAvg != -1 && quizAvg != -1);

        
        // multiple if statements to make sure that the current score is greater than or equal to
        // the final overall score and if all the scores are known print the desired response
        if(currentScore >= finalOverallScore) {
        	if(allScoresKnown) {
        		System.out.println("Congratulations! You received the " + desiredGrade + " that you wanted!");
        		System.exit(0);
        	}
        	else {
        		System.out.println("You will receive atleast a grade of " + desiredGrade + ".");
        		System.exit(0);
        	}
        }
        
        // creates a variable to calculate the required average to get the desired grade and prints 
        // desired responses
        double avgToFinalLetterGrade = (100 * finalOverallScore - (currentScore * totalKnownGradeWeight)) / (100 - totalKnownGradeWeight);

        if(avgToFinalLetterGrade <= 100) {
        	System.out.printf("In order to receive a grade of %c,\nyou need to score an average greater than\nor equal to %.2f in the rest of the grade items.", desiredGrade, avgToFinalLetterGrade);
        }
        else {
        	System.out.println("Unfortunately, a grade of " + desiredGrade + " is not possible.");
        }
        

    }
}
