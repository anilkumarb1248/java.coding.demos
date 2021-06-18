package coding.demos.strings.easy;

public class RemoveWhiteSpacesWithoutReplaceAll {
	public static void main(String[] args) {

		String s = "ab cd	ef	gh	jk lm";
		// System.out.println(s.replaceAll("\\s", "")); // abcdefghjklm

		char[] array = s.toCharArray();

		// By using Character isWhitespace() method
		StringBuilder sb = new StringBuilder();
		for (char c : array) {
			if (!Character.isWhitespace(c))
				sb.append(c);
		}

		// Without using built in methods
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ' && array[i] != '\t')
				sb1.append(array[i]);

		}
		System.out.println("Given string: " + s);
		System.out.println("Modified string: " + sb);
		System.out.println("Modified string: " + sb1);
	}
}
