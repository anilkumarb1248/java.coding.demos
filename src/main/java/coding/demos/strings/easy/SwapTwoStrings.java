package coding.demos.strings.easy;

public class SwapTwoStrings {
	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "DEFGHI";
		System.out.println("Before swapping - str1: " + str1 + ", str2: " + str2);

		// Concatenate both the string str1 and str2 and store it in str1
		str1 = str1 + str2;
		// Extract str2 from updated str1
		str2 = str1.substring(0, (str1.length() - str2.length()));
		// Extract str1 from updated str1
		str1 = str1.substring(str2.length());

		System.out.println("After swapping - str1: " + str1 + ", s2: " + str2);
	}

}
