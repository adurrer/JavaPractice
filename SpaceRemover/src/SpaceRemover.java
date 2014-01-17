
public class SpaceRemover {
	public static void main(String[] args) {
		String randomtext = "hipty hopty hoopty";
		char[] textInput = randomtext.toCharArray();
		for (int i = 0; i <textInput.length; i++) {
			char current = textInput[i];
			if (current != ' ') {
				System.out.print(current);
			} else {
				
			}
		}
		System.out.println();
	}
}
