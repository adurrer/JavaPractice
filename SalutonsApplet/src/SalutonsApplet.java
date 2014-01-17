import java.awt.Graphics;
import java.awt.Graphics2D;


public class SalutonsApplet extends javax.swing.JApplet {
	
	String greetings;
	
	public void init() {
		greetings = "Saluton mondo!";
	}
	
	public void paint(Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString(greetings, 25, 50);
	}
}
