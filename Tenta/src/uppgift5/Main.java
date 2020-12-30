package uppgift5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		Person robin = new Person(24, "Robin", "Stenford Geschwindt", "Thomas Anders", true);
		Person grinch = new Person(53, "Grinch", "N/A", "N/A", false);
		people.add(robin);
		people.add(grinch);
		System.out.println(people.get(0).name);
		System.out.println(people.get(1).likesChristmas);
	}
}
