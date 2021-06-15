package coding.demos.beginner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Using temporary variable
		int a = 10;
		int b = 20;

		System.out.println("Before swapping a: " + a + ", b: " + b);
		int temp = a;
		a = b;
		b = a;
		System.out.println("After swapping a: " + a + ", b: " + b);

		// Without using temporary variable
		int x = 10;
		int y = 20;
		System.out.println("Before swapping x: " + x + ", y: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping x: " + x + ", y: " + y);
	}
}
