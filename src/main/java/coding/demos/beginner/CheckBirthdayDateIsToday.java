package coding.demos.beginner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckBirthdayDateIsToday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data of birth dd/MM/yyyy");
		String s = scanner.next();

		LocalDate dob = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate today = LocalDate.now();

		if (today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth()) {
			System.out.println("Happy Birthday");
		} else {
			System.out.println("It's not your birthday");
		}
		scanner.close();
	}

}
