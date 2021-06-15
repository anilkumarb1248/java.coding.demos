package coding.demos.strings.average;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter sentense");
			String sentense = scanner.nextLine();

			int vowelsCount = 0;
			int consonantsCount = 0;

			String vowels = "aeiou";

			// Converting string to lower case to reduce the comparisons
			sentense = sentense.toLowerCase();

			for (int i = 0; i < sentense.length(); i++) {
				char ch = sentense.charAt(i);

				// Find the character is alphabet or not
				if (ch >= 'a' && ch <= 'z') {

					// Find the character is Vowel
					// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					if (vowels.indexOf(ch) >= 0)
						vowelsCount++;
					else
						consonantsCount++;
				}
			}
			System.out.println("Vowels Count: " + vowelsCount + ", Consonants Count: " + consonantsCount);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
