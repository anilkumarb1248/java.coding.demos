package coding.demos.beginner;

import java.util.Scanner;

public class FindAlphabet_Is_Vowel_OR_Consonant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch = scanner.next().charAt(0);

		// Using if conditions
		if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'U' | ch == 'A' | ch == 'E' | ch == 'I' | ch == 'O'
				| ch == 'U') {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is Consonent");
		}

		// Using Switch statement
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonent");
		}

		// Simple using String contains() method
		String s = "aeiouAEIOU";

		if (s.contains(String.valueOf(ch))) {
			System.out.println(ch + " is Vowel");
		} else {
			System.out.println(ch + " is Consonent");
		}

		scanner.close();
	}

}
