package coding.demos.strings.easy;

//Replace lower-case characters with upper-case and vice-versa
public class ChangeAlphabetCase {
	public static void main(String[] args) {

		String s = "aBcD*eF&gHiJ";

		// By using Character class built-in methods
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			} else if (Character.isUpperCase(s.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println("Before Conversion: " + s);
		System.out.println("After conversion: " + sb);

		// Without using built-in methods
		// A ascii is 65 & a ascii value is 97. Difference is 32
		// To convert A to a (char)((int) ch + 32)
		// To convert a to A (char)((int) ch - 32)

		StringBuilder sb1 = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				sb1.setCharAt(i, (char) ((int) ch - 32));
			} else if (ch >= 'A' && ch <= 'Z') {
				sb1.setCharAt(i, (char) ((int) ch + 32));
			}
		}
		System.out.println("After conversion 1 : " + sb1);
		System.out.println("Comparing two conversions: " + String.valueOf(sb).equals(String.valueOf(sb1)));
	}
}
