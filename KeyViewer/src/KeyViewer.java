import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class KeyViewer extends JFrame implements KeyListener {
	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel("Press any key in the text field.");
	
	KeyViewer() {
		super("KeyViewer");
		setLookAndFeel();
		setSize(350,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyText.addKeyListener(this);
		BorderLayout border = new BorderLayout();
		setLayout(border);
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent input) {
		char key = input.getKeyChar();
		keyLabel.setText("You pressed " + key);
	}
	
	public void keyPressed(KeyEvent text) {
		//do nothing, not needed for this example
	}
	
	public void keyReleased(KeyEvent text) {
		//do nothing, not needed for this example
	}
	
	private void setLookAndFeel() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			//ignore error
		}
	}
	
	public static void main(String[] args) {
		KeyViewer frame = new KeyViewer();
	}
}
