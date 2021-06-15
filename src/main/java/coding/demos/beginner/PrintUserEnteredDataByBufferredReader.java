package coding.demos.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintUserEnteredDataByBufferredReader {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Employee name");
		String name = br.readLine();

		System.out.println("Enter Employee salary");
		String s = br.readLine();
		int salary = Integer.parseInt(s);
		System.out.println("Employee name: " + name + " salary: " + salary);

		isr.close();
		br.close();
	}
}
