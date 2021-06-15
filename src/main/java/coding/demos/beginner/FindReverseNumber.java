package coding.demos.beginner;

import java.util.Scanner;

public class FindReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		int reverseNum = 0;
		while (number > 0) {
			int remainder = number % 10;
			reverseNum = reverseNum * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse Number: " + reverseNum);
	}
}
