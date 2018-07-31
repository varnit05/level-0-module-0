
public class activity2 {
	public static void main(String[] args) {
	String one = "on";
	char a = 'o';
	System.out.println(checkifcontains(one, a));
	}

	static boolean checkifcontains(String one, char a) {

		for (int i = 0; i < one.length(); i++) {
			
			if(one.charAt(i) == a) {
				return true;
			}

		}

			
		
		return false;
	}
}
