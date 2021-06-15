package coding.demos.beginner;

import java.util.Scanner;

public class CheckCharacterIsAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = scanner.next().charAt(0);

		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("Entered character is an Alphabet");
		} else {
			System.out.println("Entered character is not an Alphabet");
		}
		scanner.close();
	}
}
