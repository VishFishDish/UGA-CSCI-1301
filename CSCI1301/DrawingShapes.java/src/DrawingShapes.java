import java.util.Scanner;

public class DrawingShapes {
	
	public String rectangle(int length, int height) {
		String rectangle = "";
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < length; j++) {
				rectangle += "*";
			}
			rectangle += "\n";
		}
		return rectangle;
	}
	
	public String triangle(int length) {
		String triangle = "";
		for(int i = 1; i <= length; i++) {
			for(int j = 0; j < length - i; j++) {
				triangle += " ";
			}
			for(int k = 0; k < 2 * i - 1; k++) {
				triangle += "*";
			}
			triangle += "\n";
		
		}
		
		return triangle;
	}
	
	public String hexagon(int length) {
		String hexagon = "";
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				hexagon += " ";
			}
			for(int k = 0; k < 2 * i + length; k++) {
				hexagon += "*";
			}
			hexagon += "\n";
		}
		
		for(int i = length - 2; i >= 0; i--) {
			for(int j = 0; j < length - i - 1; j++) {
				hexagon += " ";
			}
			for(int k = 0; k < 2 * i + length; k++) {
				hexagon += "*";
			}
			hexagon += "\n";
		}
		return hexagon;
	}
	
	public String octagon(int length) {
		String octagon = "";
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				octagon += " ";
			}
			for(int k = 1; k < 2 * i + length + 1; k++) {
				octagon += "*";
			}
			octagon += "\n";
		}
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < 2 * length - 2 + length; j++) {
				octagon += "*";
			}
			octagon += "\n";
		}
		
		for(int i = length - 2; i >= 0; i--) {
			for(int j = 0; j < length - i - 1; j++) {
				octagon += " ";
			}
			for(int k = 1; k < 2 * i + length + 1; k++) {
				octagon += "*";
			}
			octagon += "\n";
		}
		return octagon;
		
	}
	
	public String pentagon(int length) {
		String pentagon = "";
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - i; j++) {
				pentagon += " ";
			}
			for(int k = 0; k < 2 * i - 1; k++) {
				pentagon += "*";
			}
			pentagon += "\n";
		}
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < 2 * length - 1; j++) {
				pentagon += "*";
			}
			pentagon += "\n";
		}
		return pentagon;
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DrawingShapes shape = new DrawingShapes();
		int length = 0; 
		int height = 0;
		String output = "";
		
		System.out.println("Enter a shape: r t h o p");
		char input = scan.nextLine().charAt(0);
		if(input != 'r' && input != 't' && input != 'h' && input != 'o' && input != 'p') {
			System.out.println("Invalid shape\nGoodbye!");
			System.exit(0);
		}
		else {
			System.out.println("Enter a length");
			length = scan.nextInt();
			if(length <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				System.exit(0);
			}
			if(input == 't') {
				output = shape.triangle(length);
				System.out.printf("Below is a triangle with two side lengths of %d *\n", length);
				System.out.println(output);
			}
			else if(input == 'h') {
				output = shape.hexagon(length);
				System.out.printf("Below is a hexagon with side lengths of %d *\n", length);
				System.out.println(output);

			}
			else if(input == 'o') {
				output = shape.octagon(length);
				System.out.printf("Below is a octagon with side lengths of %d *\n", length);
				System.out.println(output);
			}
			else if(input == 'p') {
				output = shape.pentagon(length);
				System.out.printf("Below is a pentagon with side lengths of %d *", length);
				System.out.println(output);
			}
			else if(input == 'r') {
				System.out.println("Enter a height");
				height = scan.nextInt();
				if(height <= 1) {
					System.out.println("Height must be greater than 1\nGoodbye!");
					System.exit(0);
				}
				else {
					output = shape.rectangle(length, height);
					System.out.printf("Below is a %d by %d rectangle of *\n", length, height);
					System.out.println(output);
				}
			}	
		}
	}
}
