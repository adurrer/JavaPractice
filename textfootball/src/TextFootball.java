
public class TextFootball {
	public static void main(String[] args) {
		int total = 0;
		int score = 7;
		if (score == 7) {
			System.out.println("You score a touchdown!");
		}
		if (score == 3) {
			System.out.println("You kicked a field goal!");
		}
		total = total + score;
		System.out.println("Total Score: " + total);
	}
}
