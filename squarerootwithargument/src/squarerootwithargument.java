
public class squarerootwithargument {
	public static void main(String[] args) {
		System.out.println("The square root of " + 
				Integer.valueOf(args[0]) +
				" is " +
				Math.sqrt(Integer.valueOf(args[0])));
	}
}
