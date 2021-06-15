package coding.demos.beginner;

public class FindSystemOS {

	public static void main(String[] args) {
		
		String os = System.getProperty("os.name");
		String version = System.getProperty("os.version");
		System.out.println("OS: " + os + " Version: "+ version);
	}

}
