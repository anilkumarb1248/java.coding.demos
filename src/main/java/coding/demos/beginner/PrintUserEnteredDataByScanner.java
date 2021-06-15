package coding.demos.beginner;

import java.io.IOException;
import java.util.Scanner;

public class PrintUserEnteredDataByScanner {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any string");
		String userEnteredData = scanner.next();

		System.out.println("Enter any number");
		int number = scanner.nextInt();

		System.out.println("Entered : " + userEnteredData + " - " + number);

		scanner.close();
	}
}
