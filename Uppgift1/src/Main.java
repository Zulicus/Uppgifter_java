import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Using a byte here since I don't need a whole int
		byte counter = 0;
		String password = "NoobLord69";
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Wellcome to 'Guess The Password!'. You have 3 chances to get it right, good luck!");
		// Where the whole game is run
		while (counter < 3) {
			input = scan.nextLine();
			// if the correct password is guessed
			if (password.equals(input)) {
				if (counter + 1 == 1) {
					System.out.println("Awesome!\nYou did it on the first try!");
				} else {
					System.out.println("Congratulations!\nYou did it in " + (counter + 1) + " tries!");
				}
				counter = 3;
			} else {
				counter++;
				System.out.println("Sorry, that is not correct, you have " + (3 - counter) + " tries left.");
				// This is to allow the user to try again
				if (counter == 3) {
					System.out.println("Better luck next time!");
					System.out.println("Play again? Y/N");
					input = scan.nextLine();
					if (input.equals("yes") || input.equals("y")) {
						counter = 0;
						System.out.println(
								"Wellcome to 'Guess The Password!'. You have 3 more chances to get it right, good luck!");
					} else {
						scan.close();
						return;
					}
				}
			}
		}
		scan.close();
	}
}