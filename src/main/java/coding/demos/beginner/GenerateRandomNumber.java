package coding.demos.beginner;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		// Using Math random()
		for (int i = 1; i <= 3; i++) {
			System.out.println(Math.random());
		}

		// Using Random random() method
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.println(random.nextInt(50));
		}

		// Using Random ints() method
		int noOfDigits = 4;
		random.ints(noOfDigits).forEach(System.out::println);

		// method that generates a stream of 9 integers between 50 to 90
		random.ints(9, 50, 90).forEach(System.out::println);
	}
}
