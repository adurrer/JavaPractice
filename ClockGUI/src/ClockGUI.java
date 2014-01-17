import java.awt.FlowLayout;

import javax.swing.JFrame;


public class ClockGUI extends JFrame {
	public ClockGUI() {
		super("Clock");
		setSize(225,115);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Clock time = new Clock();
		add(time);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		ClockGUI clock = new ClockGUI();
	}
}
