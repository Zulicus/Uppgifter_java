package uppgift2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		System.out.println(sum(numbers));
		numbers.add(15);
		System.out.println(sum(numbers));
		numbers.add(65);
		System.out.println(sum(numbers));
		numbers.add(9);
		System.out.println(sum(numbers));
		numbers.add(43);
		System.out.println(sum(numbers));
		numbers.add(987);
		System.out.println(sum(numbers));
		numbers.add(2);
		System.out.println(sum(numbers));
		numbers.add(89);
		System.out.println(sum(numbers));
		numbers.add(4);
		System.out.println(sum(numbers));
	}

	public static int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		return sum;
	}
}
