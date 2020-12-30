package readFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readFile {

	public static void main(String[] args) {
		String content = "";

		try {
			content = new String(Files.readAllBytes(Paths.get("text.txt")), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(content);
	}

}
