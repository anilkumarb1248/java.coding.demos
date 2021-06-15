package coding.demos.beginner;

import java.text.DecimalFormat;
import java.util.Random;

public class GenerateOTP {
	public static void main(String[] args) {
		Random random = new Random();

		int otp1 = random.nextInt(1000000); //// Number of zeros depends on the OTP digit
		System.out.println(otp1);

		String otp2 = new DecimalFormat("000000").format(new Random().nextInt(999999));
		System.out.println(otp2);

		int otpLength = 6;
		String numbers = "1234567890";
		char otp[] = new char[otpLength];

		for (int i = 0; i < otpLength; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		System.out.println(otp);
	}
}
