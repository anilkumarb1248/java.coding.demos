package coding.demos.beginner;

import java.util.Scanner;

public class DisplayFibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();

		int firstNumber = 0;
		int secondNumber = 1;
		while (firstNumber <= number) {
			System.out.print(firstNumber + " ");
			int nextValue = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextValue;
		}

	}
}
