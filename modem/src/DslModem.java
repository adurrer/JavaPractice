
public class DslModem extends Modem {
	String method = "DSL phone Connection";
		
		public void connect() {
			System.out.println("Connecting to the internet ...");
			System.out.println("Using a " + method);
		}
}
