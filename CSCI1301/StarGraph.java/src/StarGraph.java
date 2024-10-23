import java.util.Scanner;

public class StarGraph {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		int length = scan.nextInt();
		if(length <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(1);
		}
		else {
			double xVals[] = new double[length];
			double yVals[] = new double[length];
			
			System.out.print("Enter a minimum value for x: ");
			double minVal = scan.nextDouble();
			
			System.out.print("Enter the amount to increment x: ");
			double increment = scan.nextDouble();
			if(increment <= 0) {
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(1);
			}
			else {
				System.out.println("");
				System.out.println("Values");
				for(int i = 0; i < xVals.length; i++) {
					xVals[i] = minVal;
					minVal += increment;
					yVals[i] = 20.0 * Math.abs(Math.sin(xVals[i]));
					System.out.printf("x: %.3f, y: %.3f\n", xVals[i], yVals[i]);
				}
				System.out.println();
				System.out.println("Graph");
				
				for(int j = 0; j < yVals.length; j++) {
					System.out.print(":");
					for(int k = 0; k < (int) yVals[j]; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
		
			}
			
		}
		
	}
}