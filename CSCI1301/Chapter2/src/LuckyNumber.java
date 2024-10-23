import java.util.Scanner;
public class LuckyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int luckyNum = 0;
		String fullName;
		System.out.println("Enter your name: ");
		fullName = scan.nextLine();
		System.out.println("Enter your number: ");
		luckyNum = scan.nextInt();
		System.out.printf("Your lucky number is %d\n", luckyNum);
		System.out.printf("Your full name is [\"%s\"]\n", fullName.toUpperCase());
		// %d is integer
		// %f is double
		// %s is string
		// \"%s\" includes double quotes
		int x = 5;

		int y  = 5;
		System.out.println(x++); // post increment
		System.out.println(x);
		System.out.println(++y); // pre increment
		System.out.println(y);


	}
}
