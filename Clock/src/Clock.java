import java.util.Calendar;

public class Clock {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		//a nice greeting message
		if(hour < 12) {
			System.out.println("Good morning!\n");
		}
		else if (hour < 17) {
			System.out.println("Good afternoon!\n");
		}
		else {
			System.out.println("Good evening!\n");
		}
		
		//displays the minutes of the hour
		System.out.print("It's");
		if(minute != 0) {
			System.out.print(" " + minute + " ");
			System.out.print((minute != 1) ? "minutes" : "minute");
			System.out.print(" past");
		}
		
		
		//displays the hour in 12 hour format
		System.out.print(" ");
		System.out.print( (hour> 12) ? (hour - 12) : hour);
		System.out.print(" o'clock on ");
		
		//displays the month
		switch (month) {
			case 0:
				System.out.print("January");
				break;
			case 1:
				System.out.print("February");
				break;
			case 2:
				System.out.print("March");
				break;
			case 3:
				System.out.print("April");
				break;
			case 4:
				System.out.print("May");
				break;
			case 5:
				System.out.print("June");
				break;
			case 6:
				System.out.print("July");
				break;
			case 7:
				System.out.print("August");
				break;
			case 8:
				System.out.print("September");
				break;
			case 9:
				System.out.print("October");
				break;
			case 10:
				System.out.print("November");
				break;
			case 11:
				System.out.print("December");
				break;
			default:
				System.out.print("Error with month!");
				break;
		}
		
		//displays the date and year
		System.out.println(" " + day + ", " + year + ".");
	}
}
