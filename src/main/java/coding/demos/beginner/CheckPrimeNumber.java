package coding.demos.beginner;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(number + " is prime number: " + isPrime);
	}
}
