package coding.interview.questions.strings;

public class PrintGivenNumberOfWordsFromString {

	public static void main(String[] args) {
		String s = "Hello how are you Anil";
		int number = 4;
		String[] array = s.split(" ");
		for (int i = 0; i < number; i++) {
			System.out.println(array[i]);
		}

		// Without splitting
		int count = 0;
		int i = 0;
		while (i < s.length() - 1) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
				count++;
			if (count == number) {
				System.out.println(s.substring(0, i));
				break;
			}
			i++;
		}
	}
}
