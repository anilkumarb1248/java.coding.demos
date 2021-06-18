package coding.demos.strings.easy;

public class FindBiggestSmallestPalindrome {

	public static void main(String[] args) {

		String str = "Wow you are super Madam";
		String[] array = str.split(" ");
		String smallPalindrome = "";
		String bigPalindrome = "";

		for (int i = 0; i < array.length; i++) {
			if (isPalidrome(array[i])) {
				if (smallPalindrome.isEmpty() || smallPalindrome.length() > array[i].length()) {
					smallPalindrome = array[i];
				}

				if (bigPalindrome.isEmpty() || bigPalindrome.length() < array[i].length()) {
					bigPalindrome = array[i];
				}
			}
		}

		System.out.println("Small Palindrome: " + smallPalindrome);
		System.out.println("Big Palindrome: " + bigPalindrome);
	}

	public static boolean isPalidrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.setCharAt(index++, s.charAt(i));
		}

		return s.equals(String.valueOf(sb));
	}

}
