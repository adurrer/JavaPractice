
public class LetterCounter {
	public static void main(String args[]) {
		String phrase[] = {
				"Dont eat yellow snow",
				"The cow jumped over the moon",
				"Rudoff the red nose reindeer",
				"Humpy dumpy had a fall",
				"I cannot tell a lie",
				"The moonaknights",
				"Just the tip",
				"Danger zoneeeee",
				"Making bacon pancakes"
		};
		
		int[] lettercounter = new int [26];
		for (int count = 0; count < phrase.length; count++) {
			String current = phrase[count];
			char[] letters = current.toCharArray();
			for (int count2 = 0; count2 < letters.length; count2++) {
				char letter = letters[count2];
				if((letter >= 'A') & (letter <= 'Z')) {
					lettercounter[letter - 'A']++;
				}
				else if((letter >= 'a') & (letter <= 'z')) {
					lettercounter[letter - 'a']++;
				}
				else;
			}
		}
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ":" + lettercounter[count- 'A'] + "\n");
		}
		System.out.println();
	}
}
