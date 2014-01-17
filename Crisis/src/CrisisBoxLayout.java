import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class CrisisBoxLayout extends Crisis {
	CrisisBoxLayout() {
		super();
		JPanel pane = new JPanel();
		BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.add(panicButton);
		pane.add(dontPanicButton);
		pane.add(blameButton);
		pane.add(mediaButton);
		pane.add(saveButton);
		add(pane);
	}
}
