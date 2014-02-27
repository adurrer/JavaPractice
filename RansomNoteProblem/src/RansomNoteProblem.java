//Author: Andrew Durrer
//Start time: 4:30pm 2/12/2014
public class RansomNoteProblem {
	String RansomNote = "Give Us The Stamps & Nobody gets hurt ! x";
	String GoodMagazine = "Give Us The Stamps & Nobody gets hurt ! x";
	String BadMagazine = "Cant use this one";
	String GoodMagazineLowerCase = "give us the stamps & nobody gets hurt ! x";
	String GoodMagazineExtraWords = "Hello US , give nobody the stamps x & everyone gets hurt ! ... help";
	String BadMagazineBlank = "";
	
	boolean isMagWordsAvail(String RansomNote, String Magazine){
		//Assumptions: there is no case sensitive.
		//             Punctuation is required. Sure wouldn't be a threatening ransom note otherwise =).
		//			   Punctuation is always separated by a space to not confuse it as a whole word.
		
		//Split all words in both RansomNote and Magazine
		String[] RansomWords = RansomNote.split(" ");
		String[] MagazineWords = Magazine.split(" ");
		
		//Compare every ransom word with magazines words that fit the same size
		int ransomCounter = 0;
		int magazineCounter =0;
		while(ransomCounter < RansomWords.length) {
			if( RansomWords[ransomCounter].length() != MagazineWords[magazineCounter].length()){
				magazineCounter++;
				if(magazineCounter == MagazineWords.length){
					//System.out.println("Failed on word:" + RansomWords[ransomCounter]);
					return false;
				}
				
			}
			else {
				if(!RansomWords[ransomCounter].equalsIgnoreCase(MagazineWords[magazineCounter])){
					magazineCounter++;
				}
				else {
					ransomCounter++;
					//Verifying what word I am looking for matched in both magazine and ransom elements
					//System.out.println("Magazine Word:" + MagazineWords[magazineCounter]);
					//clearing the magazine word from the word options since duplicates are not allowed
					MagazineWords[magazineCounter] = "";
					//verifying the string was cleared
					//System.out.println("Was Magazine Word Cleared:" + MagazineWords[magazineCounter]);
					magazineCounter = 0;
					
					
				}
				
			}
				
		}
		//If any word fails return false, else return true.
		
		return true;
	}
	
	boolean isMagWordsAvailMoreEfficient(String RansomNote, String Magazine){
		String[] RansomWords = RansomNote.split(" ");
		String[] MagazineWords = Magazine.split(" ");
		
		//Compare every ransom word with magazines words that fit the same size
		int wordCounter;
		int elementScannedCounter;
		int matchCounter = 0;
		
		//check to see if there are enough words to fulfill the ransom note
		if(RansomWords.length > MagazineWords.length){
			return false;
		}
		else {
			for(wordCounter  = 0; wordCounter  < RansomWords.length; wordCounter++){
				//Check the ransom Word against the first and last element of the array
				//increment and decrement if the word is not found in either of the locations
				//if its found add to the match counter and clear that element so it cant be used again
				
				//checking on the the first and last element of the array for the word
				for(elementScannedCounter = 0; elementScannedCounter < (MagazineWords.length +1)/2; elementScannedCounter++){
					if(RansomWords[wordCounter].equalsIgnoreCase(MagazineWords[elementScannedCounter]) ||
							RansomWords[wordCounter].equalsIgnoreCase(MagazineWords[MagazineWords.length-1 - (elementScannedCounter)])){
						//if there is a match and both are the same, delete the word in the lowest element first
						if(RansomWords[wordCounter].equalsIgnoreCase(MagazineWords[elementScannedCounter]) &&
							RansomWords[wordCounter].equalsIgnoreCase(MagazineWords[MagazineWords.length-1 - (elementScannedCounter)])){
							MagazineWords[elementScannedCounter] = "";
							matchCounter++;
							break;
						}
						//if they one matches check to see which one
						else {
							//if the first element matches, clear the word and add to the match counter
							if(RansomWords[wordCounter].equalsIgnoreCase(MagazineWords[elementScannedCounter])) {
								MagazineWords[elementScannedCounter] = "";
								matchCounter++;
								break;
							}
							//else if the last element matches, clear the word and add to the match counter
							else {
								MagazineWords[MagazineWords.length-1 - (elementScannedCounter)] = "";
								matchCounter++;
								break;
							}
						}
					}
					//if nothing matches, move on
				}
			}
		}
		//I want to compare all elements of ransom words to the magazine words
		//Loop on element zero until element zero = the length of magazine words
		//everytime there is a match in words, clear the ransom note words.
		//after loop is done, check to see if all elements equal "",
		//change ransom note to string again,
		if(matchCounter == RansomWords.length){
			return true;
		}
		 return false;
	}
	
	public static void main(String[] args){
		RansomNoteProblem ransomNoteProblem = new RansomNoteProblem();
		System.out.println("Checking if ransom note is possible with magazine 1!");
		System.out.println("Magazine Contents: " + ransomNoteProblem.GoodMagazine);
		System.out.println("Using isMagWordsAvail() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvail(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazine));
		System.out.println("Using isMagWordsAvailMoreEfficient() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvailMoreEfficient(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazine));
		System.out.println("Checking if ransom note is possible with magazine 2!");
		System.out.println("Magazine Contents: " + ransomNoteProblem.BadMagazine);
		System.out.println("Using isMagWordsAvail() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvail(ransomNoteProblem.RansomNote, ransomNoteProblem.BadMagazine));
		System.out.println("Using isMagWordsAvailMoreEfficient() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvailMoreEfficient(ransomNoteProblem.RansomNote, ransomNoteProblem.BadMagazine));
		System.out.println("Checking if ransom note is possible with magazine 3!");
		System.out.println("Magazine Contents: " + ransomNoteProblem.GoodMagazineLowerCase);
		System.out.println("Using isMagWordsAvail() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvail(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazineLowerCase));
		System.out.println("Using isMagWordsAvailMoreEfficient() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvailMoreEfficient(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazineLowerCase));
		System.out.println("Checking if ransom note is possible with magazine 4!");
		System.out.println("Magazine Contents: " + ransomNoteProblem.GoodMagazineExtraWords);
		System.out.println("Using isMagWordsAvail() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvail(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazineExtraWords));
		System.out.println("Using isMagWordsAvailMoreEfficient() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvailMoreEfficient(ransomNoteProblem.RansomNote, ransomNoteProblem.GoodMagazineExtraWords));
		System.out.println("Checking if ransom note is possible with magazine 5!");
		System.out.println("Magazine Contents: " + ransomNoteProblem.BadMagazineBlank);
		System.out.println("Using isMagWordsAvail() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvail(ransomNoteProblem.RansomNote, ransomNoteProblem.BadMagazineBlank));
		System.out.println("Using isMagWordsAvailMoreEfficient() Method");
		System.out.println(ransomNoteProblem.isMagWordsAvailMoreEfficient(ransomNoteProblem.RansomNote, ransomNoteProblem.BadMagazineBlank));
	}
}
