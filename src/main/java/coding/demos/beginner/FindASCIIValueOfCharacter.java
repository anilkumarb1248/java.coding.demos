package coding.demos.beginner;

import java.util.Scanner;

public class FindASCIIValueOfCharacter {

	public static void main(String[] args) {

		System.out.println("Enter any character");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		int asciiValue = ch; // (Or) int AsciiValue = (int) ch;
		System.out.println("Ascii value of " + ch + " is: " + asciiValue);
		scanner.close();

		// Printing all ASCII characters (0 to 127) with value
		for (int i = 0; i <= 127; i++) {
			System.out.println((char) i + " is : " + i);
		}
	}
}
