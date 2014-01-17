import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class Crisis extends JFrame {
	JButton panicButton, dontPanicButton, blameButton, mediaButton, saveButton;
	
	public Crisis() {
		super("Crisis");
		setSize(348, 128);
		setLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		add(panicButton);
		add(dontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(mediaButton);
		add(saveButton);
		setVisible(true);
	}
	
	private  void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	public static void main (String[] args) {
		Crisis crisis = new Crisis();
		CrisisGrid crisisGrid = new CrisisGrid();
		CrisisBorder crisisBorder = new CrisisBorder();
		CrisisBoxLayout crisisBoxLayout = new CrisisBoxLayout();
	}
}
