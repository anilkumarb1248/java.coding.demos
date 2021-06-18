package coding.demos.strings.easy;

public class FindMinMaxOccuringChar {

	public static void main(String[] args) {

		// String s = "grass is greener on the other side"; // e-6 a-1
		String s = "Find the minimum and maximum occurring character"; // m-6 f-1
		String s1 = s.toLowerCase();
		s1 = s1.replaceAll("\\s", ""); // If you don't want to consider the spaces

		char minChar = ' ';
		char maxChar = ' ';
		int minFinds = 0;
		int maxFinds = 0;

		int finds;

		for (int i = 0; i < s1.length(); i++) {
			finds = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					finds++;
				}
			}

			if (finds < minFinds || minFinds == 0) {
				minFinds = finds;
				minChar = s1.charAt(i);
			}
			if (finds > maxFinds) {
				maxFinds = finds;
				maxChar = s1.charAt(i);
			}
		}

		System.out.println("Max occurring character is: " + maxChar + " Occurrances: " + maxFinds);
		System.out.println("Min occurring character is: " + minChar + " Occurrances: " + minFinds);
	}

}
