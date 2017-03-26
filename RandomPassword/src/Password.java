
public class Password {
	
	public static int length = 30;
	public static int numberOfPasswords = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= numberOfPasswords; i++) {
			String pswd = generator();
			System.out.println(pswd);	
		}
	}
	
	public static String generator() {
		String password = "";
		// ASCII values that are not included when making passwords. Values are in base 10
		int[] unusedValues = {34, 39, 40, 41, 43, 44, 45, 47, 58, 59, 60, 61, 62, 91, 92, 93, 94, 95, 96};
		boolean cont = false;
		for (int i = 1; i <= length; i ++) {
			cont = true;
			int random = (int) ((Math.random() * 90) + 33);
			for (int j : unusedValues) {
				if (random == j) {
					i--;
					cont = false;
				}
			}
			if (cont == true)
				password += ((char)random);
			else
				continue;
		}
		return password;
	}
}