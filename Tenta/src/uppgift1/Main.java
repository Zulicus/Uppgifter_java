package uppgift1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> texts = new ArrayList<String>();
		texts.add("Hello, my name is Robin, what's yours?");
		System.out.println(leangthsOfTexts(texts));
		texts.add("Hi Robin, my name is Jonas");
		System.out.println(leangthsOfTexts(texts));
		texts.add("Hi Jonas, glad you could make it!");
		System.out.println(leangthsOfTexts(texts));
		texts.add("Thank you");
		System.out.println(leangthsOfTexts(texts));
		texts.add("So you're here about the job right?");
		System.out.println(leangthsOfTexts(texts));
		texts.add("Yeah");
		System.out.println(leangthsOfTexts(texts));
		texts.add("Okay then, first let me start of by saying that this won't take long");
		System.out.println(leangthsOfTexts(texts));
	}

	public static ArrayList<String> leangthsOfTexts(ArrayList<String> texts) {
		ArrayList<String> leangths = new ArrayList<String>();
		for (int i = 0; i < texts.size(); i++) {
			String text = texts.get(i);
			leangths.add(String.valueOf(text.length()));
		}
		return leangths;
	}
}