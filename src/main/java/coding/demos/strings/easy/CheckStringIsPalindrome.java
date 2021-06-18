package coding.demos.strings.easy;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		String str = "Aibohphobia"; //"Madam"
		str = str.toLowerCase();

		// By using reverse() method of StringBuilder
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println(str.equals(String.valueOf(sb)));

		// Without using reverse() method
		StringBuilder sb1 = new StringBuilder(str);
		int index = 0;
		for (int i = (str.length() - 1); i >= 0; i--) {
			sb1.setCharAt(index++, str.charAt(i));
		}
		System.out.println(str.equals(String.valueOf(sb1)));
	}

}
