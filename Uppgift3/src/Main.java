import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean gameIsRunning = true;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String[] gameWordList = { "strawberry", "cheesecake", "chowder", "lemon", "grease", "christmas", "fryer",
				"pizza", "matchbox", "tv", "ashtray", "candle", "boar", "victory", "fakenews", "curtain", "key",
				"moomin", "chihuahua", "chailatte" };
		System.out.println("Welcome to hangman");
		// Allows for the game to be played multiple times
		while (gameIsRunning) {
			System.out.println("To get a word type: 1");
			System.out.println("To type in you own word type: 2");
			String input = scan.nextLine();
			if (input.equals("1")) {
				int number = rand.nextInt(gameWordList.length);
				gameEngin(gameWordList[number]);
			} else if (input.equals("2")) {
				System.out.println("Please enter the wordkey");
				String playerChoice = scan.nextLine();
				gameEngin(playerChoice);
			} else {
				System.out.println("Error! Please input a correct value!");
			}
			System.out.println("Try again? y/n");
			input = scan.nextLine();
			if (input.equals("y") || input.equals("yes")) {
				// Nothing here so that the game continues
			} else {
				gameIsRunning = false;
			}
		}
		scan.close();
	}

//Where the game is run
	public static void gameEngin(String gameWord) {
		// How many lives the player has
		int hangCounter = 11;
		boolean gameIsRunning = true;
		Scanner scan = new Scanner(System.in);
		String playerGuess;
		// The different arrays with what is to be printed out
		String[] hangPrintOut = { "/|\\", " |", " |", " |", " |", " |", "  ____" };
		String[] manPrintOut = { "", "", "   / \\", "   /|\\", "    o", "    |", "", };
		// This one is to accommodate any word the player enters (within reason)
		String[] wordPrintOut = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", };
		// This function places empty underscores so that the player can see how many
		// letters are in the word
		for (int i = 0; i < gameWord.length(); i++) {
			wordPrintOut[i] = "_ ";
		}
		System.out.println("Game Start!");
		// While the guessing process going on this will run
		while (gameIsRunning) {
			System.out.println("You have " + hangCounter + " tries left!");
			for (int i = 0; i < gameWord.length(); i++) {
				System.out.print(wordPrintOut[i]);
			}
			System.out.println("\nPlease enter a letter or guess the word");
			playerGuess = scan.nextLine();
			if (playerGuess.length() > 1) {
				if (testForWord(playerGuess, gameWord)) {
					System.out.println("Congratulations, you did it!");
					gameIsRunning = false;
				} else {
					System.out.println("Sorry that is not correct!");
					hangCounter--;
				}
			} else if (playerGuess.length() == 1) {
				char input = playerGuess.charAt(0);
				// In order to catch whether or not the array changed later I have to create a
				// NEW array
				String[] tempArray = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
						"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", };
				for (int i = 0; i < wordPrintOut.length; i++) {
					tempArray[i] = wordPrintOut[i];
				}
				wordPrintOut = testForLetter(input, gameWord, wordPrintOut);
				if (Arrays.equals(wordPrintOut, tempArray)) {
					System.out.println("Sorry that is not correct!");
					hangCounter--;
				}
			}
			// Here the hangman is being drawn depending on how many tries are left
			if (hangCounter == 0) {
				for (int i = hangPrintOut.length; i > 0; i--) {
					System.out.print(hangPrintOut[i - 1]);
					System.out.println(manPrintOut[i - 1]);
				}
				System.out.println("You Lose!");
				System.out.println("The correct word was: " + gameWord);
				gameIsRunning = false;
			} else if (hangCounter <= 11 && hangCounter > 3) {
				for (int i = 0 + (11 - hangCounter); i > 0; i--) {
					System.out.println(hangPrintOut[i - 1]);
				}
			} else if (hangCounter <= 3) {
				for (int i = hangPrintOut.length; i > 0; i--) {
					switch (hangCounter) {
					case 3:
						if (i <= 7 && i >= 6) {
							System.out.print(hangPrintOut[i - 1]);
							System.out.println(manPrintOut[i - 1]);
						} else {
							System.out.println(hangPrintOut[i - 1]);
						}
						break;
					case 2:
						if (i <= 7 && i >= 5) {
							System.out.print(hangPrintOut[i - 1]);
							System.out.println(manPrintOut[i - 1]);
						} else {
							System.out.println(hangPrintOut[i - 1]);
						}
						break;
					case 1:
						if (i <= 7 && i >= 4) {
							System.out.print(hangPrintOut[i - 1]);
							System.out.println(manPrintOut[i - 1]);
						} else {
							System.out.println(hangPrintOut[i - 1]);
						}
						break;
					default:

						break;
					}
				}
			}
			// Here the code checks if the player have filled all the gaps, and thus won
			if (!Arrays.stream(wordPrintOut).anyMatch("_ "::equals)) {
				for (int i = 0; i < gameWord.length(); i++) {
					System.out.print(wordPrintOut[i]);
				}
				System.out.println("\nCongratulations, you did it!");
				gameIsRunning = false;
			}
		}
	}

//Here the code checks if the player's guessed word and the answer is the same
	public static boolean testForWord(String input, String gameWord) {
		return gameWord.toLowerCase().equals(input.toLowerCase());
	}

//Here the code checks if the player's guessed letter is present in the answer word
	public static String[] testForLetter(char input, String gameWord, String[] wordPrintOut) {
		for (int i = 0; i < gameWord.length(); i++) {
			if (input == gameWord.charAt(i)) {
				wordPrintOut[i] = String.valueOf(input);
			}
		}
		return wordPrintOut;
	}
}
