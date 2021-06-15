package coding.demos.beginner;

import java.util.Scanner;

public class CheckNumberIsPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		int actualNum = number;
		int reverseNum = 0;
		// Reversing the number
		while (number > 0) {
			int remainder = number % 10;
			reverseNum = reverseNum * 10 + remainder;
			number = number / 10;
		}

		if (actualNum == reverseNum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
