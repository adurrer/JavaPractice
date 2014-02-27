
public class ReverseString {
	public String inputstring = "Reverse this string";
	public String outputstring;
	public ReverseString(){
	}
	
	String reverseString(String input) {
		char temp;
		int stringLen = input.length()-1;
		char[] stringarray = input.toCharArray();
		for(int i=0; i<= stringLen; i++){
			temp = stringarray[i];
			stringarray[i] = stringarray[stringLen - i];
			stringarray[stringLen-i] = temp;
		}
		return stringarray.toString();
	}
	
	public static void main(String[] args){
		ReverseString RS = new ReverseString();
		
		System.out.println(RS.inputstring);
		RS.outputstring = RS.reverseString(RS.inputstring);
		System.out.println(RS.outputstring);
		
	}
}
