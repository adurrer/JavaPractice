import java.awt.BorderLayout;


public class CrisisBorder extends Crisis {
	CrisisBorder() {
		super();
		BorderLayout crisisLayout = new BorderLayout();
		setLayout(crisisLayout);
		add(panicButton, BorderLayout.NORTH);
		add(dontPanicButton, BorderLayout.SOUTH);
		add(blameButton, BorderLayout.WEST);
		add(mediaButton, BorderLayout.EAST);
		add(saveButton, BorderLayout.CENTER);
	}
}
