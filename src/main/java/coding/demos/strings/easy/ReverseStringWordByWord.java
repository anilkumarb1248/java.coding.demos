package coding.demos.strings.easy;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
		String s = "Anil Kumar Bandari";
		String[] array = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			array[i] = reverse(array[i]);
			sb.append(array[i] + " ");
		}

		System.out.println("Given string: " + s);
		System.out.println("Modified string: " + sb);
	}

	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		// return String.valueOf(sb.reverse());
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.setCharAt(index++, s.charAt(i));
		}
		return String.valueOf(sb);
	}
}
