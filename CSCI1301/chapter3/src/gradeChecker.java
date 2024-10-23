import java.util.*;
public class gradeChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char letterGrade = 'F';
		
		switch(letterGrade) {
		case 'A':
			System.out.println("Grade is between 90 and 100");
			break;
		case 'B':
			System.out.println("Grade is between 80 and 89");
			break;
		case 'C':
			System.out.println("Grade is between 70 and 79");
			break;
		default:
			System.out.println("Grade is between 0 and 59");
		}
		
		System.out.println("After Switch");
			
		
			
	}
}
