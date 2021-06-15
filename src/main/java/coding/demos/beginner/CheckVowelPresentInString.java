package coding.demos.beginner;

import java.util.Scanner;

public class CheckVowelPresentInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text");
		String text = scanner.next();
		scanner.close();

		if (text.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("Vowel Found");
		} else {
			System.out.println("Vowel not found");
		}
	}
}
