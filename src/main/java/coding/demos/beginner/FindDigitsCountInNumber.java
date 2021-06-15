package coding.demos.beginner;

import java.util.Scanner;

public class FindDigitsCountInNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		int digitCount = 0;
		while (number > 0) {
			number = number / 10;
			digitCount++;
		}
		System.out.println("Digit Count: " + digitCount);
	}
}
