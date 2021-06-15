package coding.demos.strings.easy;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {

//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter sentense");
			String sentense = scanner.nextLine(); // br.readLine();

			// If you consider space also a character
			System.out.println("Count including space:" + sentense.length());

			// excluding the space
			int count = 0;
			for (int i = 0; i < sentense.length(); i++) {
				if (sentense.charAt(i) != ' ')
					count++;
			}
			System.out.println("Count excluding space:" + count);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
