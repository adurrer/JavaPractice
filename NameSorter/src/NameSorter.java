import java.util.Arrays;

public class NameSorter {
	public static void main(String[] args) {
		String names[] = {"Dan", "Steve", "Frank", "Julie",
				"Stephanie", "Liza", "Andy", "Anne", "Joel",
				"Chad", "Robert", "Jason"};
		System.out.println("The orginial order:");
		for(int i = 0; i< names.length;i++) {
			System.out.print(i + ": " + names[i] + " ");
		}
		Arrays.sort(names);
		System.out.println("\nThe new order:");
		for(int i = 0; i < names.length; i++) {
			System.out.print(i + ": " + names[i] + " ");
		}
		System.out.println();
	}
}
