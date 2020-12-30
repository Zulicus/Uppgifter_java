package uppgift3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		System.out.println(average(numbers));
		numbers.add(4);
		System.out.println(average(numbers));
		numbers.add(98);
		System.out.println(average(numbers));
		numbers.add(5);
		System.out.println(average(numbers));
		numbers.add(3);
		System.out.println(average(numbers));
		numbers.add(87);
		System.out.println(average(numbers));
		numbers.add(32);
		System.out.println(average(numbers));
		numbers.add(9);
		System.out.println(average(numbers));
		numbers.add(14);
		System.out.println(average(numbers));
	}

	public static double average(ArrayList<Integer> numbers) {
		double sum = 0;
		double total = numbers.size();
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		return sum / total;
	}
}
