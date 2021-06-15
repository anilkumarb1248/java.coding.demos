package coding.demos.beginner;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();

		// Using recursive function
		System.out.println("Factorial of " + number + " by recursive: " + fact(number));

		// Using while loop
		System.out.print("Factorial of " + number + " by while loop: ");
		int fact = 1;
		while (number > 0) {
			fact = fact * number--;
		}
		System.out.print(fact);
		scanner.close();
	}

	public static int fact(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * fact(number - 1);
		}
	}
}
