import java.util.Scanner;

public class loops {
	enum MovieRating {G, PG, PG13, R, NC17};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int length = scan.nextInt();

		double[] grades = new double[length];

		for(int i = 0; i < grades.length; i++) {

			double grade = 0.0;

			do {
				System.out.println("Enter a grade between [0, 100]: ");
				grade = scan.nextDouble();
			} while(grade < 0 || grade > 100);

			System.out.println("Accepted grade: " + grade + "\n");
			grades[i] = grade;
		} 

		double average = 0.0;
		for (double grade : grades) {
			average += grade;

		}
		average /= grades.length;

		System.out.println(average);


		for (MovieRating rating : MovieRating.values()) {
			System.out.println(rating);  
		}

	}
}
