package coding.demos.strings.easy;

public class ReverseStringWithFixedSpacePosition {

	public static void main(String[] args) {
		String s = "ab cde fghi";
		// Output should be: ih gfe dcba

		StringBuilder sb = new StringBuilder(s);

		int sIndex = s.length() - 1;
		int sbIndex = 0;
		while (sIndex >= 0) {
			if (s.charAt(sIndex) != ' ' && sb.charAt(sbIndex) != ' ') {
				sb.setCharAt(sbIndex++, s.charAt(sIndex--));
			} else {
				if (s.charAt(sIndex) == ' ')
					sIndex--;

				if (sb.charAt(sbIndex) == ' ')
					sbIndex++;
			}

		}

		System.out.println("Given string: " + s);
		System.out.println("Modified string: " + sb);
	}

}
