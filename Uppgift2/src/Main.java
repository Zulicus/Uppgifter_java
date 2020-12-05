import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println("Welcome to Rock Paper Scissor, please type in number of players (1 or 2)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		while (play) {
			if (input.equals("1") || input.equals("one")) {
				singlePlayer();
				play = playAgain();

			} else if (input.equals("2") || input.equals("two")) {
				multiPlayer();
				play = playAgain();
			} else {
				System.out.println("Please select a valid imput");
			}
			if(play) {
				System.out.println("Please type in number of players (1 or 2)");
				input = scan.nextLine();
			}
			
		}
		scan.close();
	}

	public static boolean playAgain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Play again? y/n");
		String input = scan.nextLine();
		if (input.toLowerCase().equals("yes") || input.toLowerCase().equals("y")) {
			return true;
		} else {
			return false;
		}
	}

	public static void singlePlayer() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("One player selected!");
		System.out.println("Player, choose /Rock/(1), /Paper/(2) or /Scissor/(3): ");
		String inputOne = scan.nextLine();
		String computer = Integer.toString(rand.nextInt(3) + 1);
		runGame(inputOne, computer);
	}

	public static void multiPlayer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Two players selected!");
		System.out.println("Player one choose /Rock/(1), /Paper/(2) or /Scissor/(3): ");
		String inputOne = scan.nextLine();
		System.out.println("Player two choose /Rock/(1), /Paper/(2) or /Scissor/(3): ");
		String inputTwo = scan.nextLine();
		runGame(inputOne, inputTwo);
	}

	public static void runGame(String playerOne, String playerTwo) {
		playerOne = playerOne.toLowerCase();
		playerTwo = playerTwo.toLowerCase();
		switch (playerOne) {
		case "rock": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Draw!");
				break;
			}
			case "paper": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "scissor": {
				System.out.println("Player One Wins!");
				break;
			}
			case "1": {
				System.out.println("Draw!");
				break;
			}
			case "2": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "3": {
				System.out.println("Player One Wins!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}

			break;
		}
		case "paper": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Player One Wins!");
				break;
			}
			case "paper": {
				System.out.println("Draw!");
				break;
			}
			case "scissor": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "1": {
				System.out.println("Player One Wins!");
				break;
			}
			case "2": {
				System.out.println("Draw!");
				break;
			}
			case "3": {
				System.out.println("Player Two Wins!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}
			break;
		}
		case "scissor": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "paper": {
				System.out.println("Player One Wins!");
				break;
			}
			case "scissor": {
				System.out.println("Draw!");
				break;
			}
			case "1": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "2": {
				System.out.println("Player One Wins!");
				break;
			}
			case "3": {
				System.out.println("Draw!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}
			break;
		}
		case "1": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Draw!");
				break;
			}
			case "paper": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "scissor": {
				System.out.println("Player One Wins!");
				break;
			}
			case "1": {
				System.out.println("Draw!");
				break;
			}
			case "2": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "3": {
				System.out.println("Player One Wins!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}
			break;
		}
		case "2": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Player One Wins!");
				break;
			}
			case "paper": {
				System.out.println("Draw!");
				break;
			}
			case "scissor": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "1": {
				System.out.println("Player One Wins!");
				break;
			}
			case "2": {
				System.out.println("Draw!");
				break;
			}
			case "3": {
				System.out.println("Player Two Wins!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}
			break;
		}
		case "3": {
			switch (playerTwo) {
			case "rock": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "paper": {
				System.out.println("Player One Wins!");
				break;
			}
			case "scissor": {
				System.out.println("Draw!");
				break;
			}
			case "1": {
				System.out.println("Player Two Wins!");
				break;
			}
			case "2": {
				System.out.println("Player One Wins!");
				break;
			}
			case "3": {
				System.out.println("Draw!");
				break;
			}
			default:
				System.out.println("Invalid choice by player two!");
				break;
			}
			break;
		}
		default:
			System.out.println("Invalid choice by player one!");
			break;
		}
	}

}
