package coding.demos.beginner;

public class GetWorkingDirectory {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
	}
}
