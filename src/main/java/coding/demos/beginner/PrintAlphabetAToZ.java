package coding.demos.beginner;

public class PrintAlphabetAToZ {

	public static void main(String[] args) {

		// Printing alphabets in lower case
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print((char) c);
		}
		
		System.out.println();
		// Printing alphabets in upper case
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print((char) c);
		}
	}
}
