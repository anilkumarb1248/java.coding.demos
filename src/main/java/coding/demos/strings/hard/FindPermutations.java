package coding.demos.strings.hard;

public class FindPermutations {
	//Not a proper solution
	// Find here proper Sol: https://www.javatpoint.com/java-program-to-ind-all-the-permutations-of-a-string

	public static void main(String[] args) {
		String s = "abc";

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			for (int j = 0; j < s.length(); j++) {
				if (i != j) {
					sb.append(s.charAt(j));
				}
			}
			
			System.out.println(sb.toString());
			sb = new StringBuffer();
			sb.append(s.charAt(i));
			for (int j = s.length() - 1; j >= 0; j--) {
				if (i != j) {
					sb.append(s.charAt(j));
				}
			}
			System.out.println(sb.toString());
			sb = new StringBuffer();
		}
	}

}
