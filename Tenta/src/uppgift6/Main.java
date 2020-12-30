package uppgift6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String palindrome = "kayak";
		String notAPalindrome = "cows";
		System.out.println(isPlaindrome(palindrome));
		System.out.println(isPlaindrome(notAPalindrome));
		System.out.println(isPlaindrome("mAdam"));
		System.out.println(isPlaindrome("sweden"));
		System.out.println(isPlaindrome("racecar"));
		System.out.println(isPlaindrome("RaCecAr"));
		System.out.println(isPlaindrome("Hello"));
		System.out.println(isPlaindrome("Taco Cat"));
		System.out.println(isPlaindrome("noon"));
		System.out.println(isPlaindrome("Was it a car or a cat I saw"));
		System.out.println(isPlaindrome("Hi my name is tiki"));
	}

	private static boolean isPlaindrome(String text) {
		ArrayList<Character> charList = new ArrayList<Character>();
		boolean isPlaindrome = true;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				charList.add(text.charAt(i));
			}
		}
		for (int i = 0; i < charList.size(); i++) {
			char characterOne = Character.toLowerCase(charList.get(i));
			char characterTwo = Character.toLowerCase(charList.get((charList.size() - 1) - i));
			if (characterOne != characterTwo) {
				isPlaindrome = false;
			}
		}
		return isPlaindrome;
	}
}
