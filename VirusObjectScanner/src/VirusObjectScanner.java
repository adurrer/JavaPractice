
public class VirusObjectScanner {
	public static void main(String[] args) {
		int numVirusObjs = Integer.parseInt(args[0]);
		if(numVirusObjs > 0) {
			VirusObject[] virusObjects = new VirusObject[numVirusObjs];
			for ( int i = 0; i < numVirusObjs; i++) {
				virusObjects[i] = new VirusObject();
			}
			System.out.println("There are " + VirusObject.getVirusObjectCount() + " virus objects."); 
		}
	}
}
