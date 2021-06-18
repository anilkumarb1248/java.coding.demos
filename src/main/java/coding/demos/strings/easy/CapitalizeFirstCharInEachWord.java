package coding.demos.strings.easy;

public class CapitalizeFirstCharInEachWord {

	public static void main(String[] args) {

		String s = "anil kumar bandari";
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			if (i == 0 || sb.charAt(i - 1) == ' ') {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
		}
		System.out.println("Givin string: " + s);
		System.out.println("Modified string: " + sb);
	}

}
