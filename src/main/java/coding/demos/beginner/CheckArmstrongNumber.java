package coding.demos.beginner;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		int temp = number;
		int armstrong = 0;

		while (number > 0) {
			int digit = number % 10;
			armstrong = armstrong + (digit * digit * digit);
			number = number / 10;
		}

		if (temp == armstrong) {
			System.out.println("Given number is Armstrong");
		} else {
			System.out.println("Given number is not Armstrong");
		}
	}
}
