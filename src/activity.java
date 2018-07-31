
public class activity {

	public static void main(String[] args) {
		String one = "1";
		String two = "1";
		System.out.println(CheckIfEqual(one, two));
		System.out.println(CheckIfEqual("one", "two"));
	}

	static boolean CheckIfEqual(String one, String two) {
		if (one.equals(two)) {
			return true;

		}
		
		return false;
		

	}
}
