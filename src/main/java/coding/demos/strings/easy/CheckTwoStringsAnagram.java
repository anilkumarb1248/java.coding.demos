package coding.demos.strings.easy;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringsAnagram {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first string");
			String firstString = scanner.next();

			System.out.println("Enter second string");
			String secondString = scanner.next();
			
			//Converting both the string to lower case.  
			firstString = firstString.toLowerCase();  
			secondString = secondString.toLowerCase();  

			if (firstString.length() == secondString.length()) {

				// ---- Way 1 - Using Arrays Sort() method
				//Converting both the arrays to character array  
				char array1[] = firstString.toCharArray();
				char array2[] = secondString.toCharArray();

				 //Sorting the arrays using in-built function sort ()  
				Arrays.sort(array1);
				Arrays.sort(array2);

				 //Comparing both the arrays using in-built function equals ()  
				if (Arrays.equals(array1, array2)) {
					System.out.println("Anagrams");
				} else {
					System.out.println("Not anagrams");
				}

				// ----  Way 2 without using built in methods of Arrays
				boolean flag = true;
				for (int i = 0; i < firstString.length(); i++) {
					if (firstString.indexOf(secondString.charAt(i)) < 0
							|| secondString.indexOf(firstString.charAt(i)) < 0) {
						flag = false;
						break;
					}
				}
				System.out.println("Angrams: " + flag);

			} else {
				System.out.println("Not anagrams");
			}
		}
	}
}
