package uppgift4;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		System.out.println(sort(numbers));
		numbers.add(4);
		System.out.println(sort(numbers));
		numbers.add(98);
		System.out.println(sort(numbers));
		numbers.add(5);
		System.out.println(sort(numbers));
		numbers.add(3);
		System.out.println(sort(numbers));
		numbers.add(87);
		System.out.println(sort(numbers));
		numbers.add(32);
		System.out.println(sort(numbers));
		numbers.add(9);
		System.out.println(sort(numbers));
		numbers.add(14);
		System.out.println(sort(numbers));
	}

	public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
		ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			sortedNumbers.add(numbers.get(i));
		}
		sortedNumbers.sort(Comparator.naturalOrder());
		return sortedNumbers;
	}
}
