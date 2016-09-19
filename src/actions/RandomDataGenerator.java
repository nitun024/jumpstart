package actions;

public class RandomDataGenerator {

	/**
	 * Generates random email address like 'test15156@gmail.com'
	 */

	public static String randomEmail(String pre, String post) {
		int randomNum = 1 + (int) (Math.random() * 9999999);
		return (pre + randomNum + "@" + post + ".com");
	}
}
