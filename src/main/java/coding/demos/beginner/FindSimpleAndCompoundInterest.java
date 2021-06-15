package coding.demos.beginner;

import java.util.Scanner;

public class FindSimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Amout");
		double amount = scanner.nextDouble();

		System.out.println("Enter Rate of Interest");
		double rateOfInterest = scanner.nextDouble();

		System.out.println("Enter years");
		double years = scanner.nextDouble();
		scanner.close();

		// Simple Interest Formula = (P × R × T)/100
		// Where P = Principal Amount, R = Rate per Annum, T = Time (years)

		double simpleInterest = (amount * rateOfInterest * years) / 100;
		System.out.println("Simple Interest: " + simpleInterest);

		// Compound Interest Formula: P * (1+R/100) power of T
		double compoundInterest = amount * (Math.pow(1 + rateOfInterest / 100, years));
		System.out.println("Compound Interest: " + compoundInterest);
	}
}
