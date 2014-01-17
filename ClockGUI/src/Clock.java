import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends JPanel {
	public Clock() {
		super();
		String currentTime = getTime();
		JLabel time = new JLabel("Time: ");
		JLabel current = new JLabel(currentTime);
		add(time);
		add(current);
	}
	
	private String getTime() {
		
		String time;
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		String monthName = "";
		switch (month) {
			case 0:
				monthName = "January";
				break;
			case 1:
				monthName = "February";
				break;
			case 2:
				monthName = "March";
				break;
			case 3:
				monthName = "April";
				break;
			case 4:
				monthName = "May";
				break;
			case 5:
				monthName = "June";
				break;
			case 6:
				monthName = "July";
				break;
			case 7:
				monthName = "August";
				break;
			case 8:
				monthName = "September";
				break;
			case 9:
				monthName = "October";
				break;
			case 10:
				monthName = "November";
				break;
			case 11:
				monthName = "December";
				break;
			default:
				monthName = "Error with month!";
				break;
		}
		
		time = monthName + " " + day + ", " + year + " " + hour + ":" + minute;
		return time;
	}
}
