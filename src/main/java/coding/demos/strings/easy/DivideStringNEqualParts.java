package coding.demos.strings.easy;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStringNEqualParts {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			// String s = "123456789";
			// System.out.println(s.substring(3)); //456789
			// System.out.println(s.substring(2,5)); //345 -- startIndex to (endIndex-1)

			System.out.println("Enter string");
			String s = scanner.next();
			
			System.out.println("Enter number of parts");
			int parts = scanner.nextInt();

			if (null == s || s.length() % parts != 0) {
				throw new RuntimeException("String can not be devided into " + parts + " parts");
			}

			int temp = 0;
			String array[] = new String[s.length() / parts];
			for (int i = 0; i < s.length(); i = i + parts) {
				array[temp++] = s.substring(i, i + parts);
			}
			
			// To print the array, array.toString() doesn't work
			//We have to use Arrasy.toString(array) method
			System.out.println(Arrays.toString(array));
			

		}
	}

}
