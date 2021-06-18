package coding.demos.strings.easy;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {

		String s = "ab cd	ef	gh   jk lm";
		System.out.println(s.replaceAll(" ", "")); //abcd	ef	ghjklm
		//If there is a tab space, replaceAll doesn't work
		
		// We need to use Regular expression
		System.out.println(s.replaceAll("\\s+", "")); // abcdefghjklm
		System.out.println(s.replaceAll("\\s", "")); // abcdefghjklm
	}

}
