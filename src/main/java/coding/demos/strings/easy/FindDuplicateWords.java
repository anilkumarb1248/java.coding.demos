package coding.demos.strings.easy;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose bug";
		string = string.toLowerCase();
		String[] words = string.split(" ");

		// To print Directly
		int count;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					words[j] = "0";
				}
			}

			if (count > 1 && !words[i].equals("0"))
				System.out.println(words[i]);
		}

		// To collect
		String[] array = string.split(" ");
		Set<String> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (words[i].equals(array[j])) {
					count++;
				}
			}
			if (count > 1)
				set.add(array[i]);
		}
		System.out.println("Set: " +set);
	}
}
