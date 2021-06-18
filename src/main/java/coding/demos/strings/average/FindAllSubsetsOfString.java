package coding.demos.strings.average;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllSubsetsOfString {
	// CAT - c,a,t,ca,at, cat - (n*(n+1))/2 = (3*(3+1))/2=6 subsets
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter string");
			String s = scanner.next();

			int length = s.length();
			int possibleSubsets = (length * (length + 1)) / 2;
			
			String subsets[] = new String[possibleSubsets];
			int temp = 0;
			for (int i = 0; i < length; i++) {
				for (int j = i; j < length; j++) {
					subsets[temp++] = s.substring(i, j+1);
				}
			}
			System.out.println(subsets.length);
			System.out.println(Arrays.toString(subsets));
		}
	}
}
