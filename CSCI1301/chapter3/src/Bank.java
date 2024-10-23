import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double withdrawAmount = 0;
		double accountBalance = 120.45;
		String accPassword = "password";
		String userPassword = "";

		System.out.print("Enter your password: ");
		userPassword = scan.nextLine();

		if (userPassword.equals(accPassword)) {
			System.out.print("How much do you want to withdraw: $");
			withdrawAmount = scan.nextDouble();

			if ((withdrawAmount >= 0) && (withdrawAmount < accountBalance)) {
				accountBalance -= withdrawAmount;
				System.out.printf("You withdrew $%.2f\n", withdrawAmount);
				System.out.printf("Your account balance is: $%.2f\n", accountBalance);
			}

			else if (withdrawAmount < 0){
				System.err.println("Cannot withdraw a negative number");

			}
			else {
				System.out.println("Insufficient Funds");
			}
		}
		else {
			System.err.println("Wrong Password");
			System.exit(1);
		}






	}
}
