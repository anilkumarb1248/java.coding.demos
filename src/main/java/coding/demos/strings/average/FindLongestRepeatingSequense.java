package coding.demos.strings.average;

import java.util.ArrayList;
import java.util.List;

public class FindLongestRepeatingSequense {
	public static void main(String[] args) {

		 String s = "acbdfapqrghybdfpqr"; //[bdf, pqr]
		// String s = "geeksforgeeks"; //geeks
		// String s = "aab"; // a
		// String s = "aabaabaaba"; //aaba
		// String s = "aaaaaaaaaaa"; //aaaaa
		//String s = "banana"; // an or na

		System.out.println("Longest repeating sequence: " + findLongestRepeatingSubString(s));
		System.out.println("Longest repeating sequence: " + findAllLongestRepeatingSubStrings(s));
	}

	public static String findLongestRepeatingSubString(String s) {
		s = s.toLowerCase();
		String longest = "";
		String subString = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				subString = s.substring(i, j + 1);
				// if(s.split(subString).length > 2 && subString.length() > longest.length()) {
				// // Not worked - count is missing if string is at the end
				if (s.indexOf(subString, j + 1) > 0 && subString.length() > longest.length()) {
					longest = subString;
				}
			}
		}
		return longest;
	}

	private static String findAllLongestRepeatingSubStrings(String s) {
		String subString = "";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				subString = s.substring(i, j + 1);
				if (s.indexOf(subString, j + 1) > 0) {
					
					if (list.isEmpty()) {
						list.add(subString);
					} else {
						if (subString.length() > list.get(0).length()) {
							list.clear();
							list.add(subString);
						}else if (subString.length() == list.get(0).length()) {
							list.add(subString);
						}
					}
				}
			}
		}

		return list.toString();
	}

}
