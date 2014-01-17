
public class VirusObject {
	static int virusCount = 0;
	
	public VirusObject() {
		virusCount++;
	}
	
	static int getVirusObjectCount() {
		return virusCount;
	}
}
