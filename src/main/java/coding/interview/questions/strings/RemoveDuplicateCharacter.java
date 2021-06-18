package coding.interview.questions.strings;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s = "Hello how are you Aniil";
		// Output should be: Helo how are you Anil

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || s.charAt(i) != s.charAt(i - 1))
				sb.append(s.charAt(i));
		}

		System.out.println("Given string: " + s);
		System.out.println("Modified string: " + sb);
	}
}
