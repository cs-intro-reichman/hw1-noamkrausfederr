// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		//Creating a string that holds the value of minutes, so that
		//if the value is less than 10, the first index is 0.
		String min = "";
		if (minutes<10) {
			min += "0" + minutes;
		} else {
			min += minutes;
		}

		//If the time ranges of AM and PM are 12 hours, and i want to stay in the AM hours, i
		//need to deduct the PM hours by 12
		if (hours == 12) {
			System.out.println(hours + ":" + min + " PM");
		} else if (hours > 12) {
			hours-=12;
			System.out.println(hours + ":" + min + " PM");
		} else {
			System.out.println(hours + ":" + min + " AM");		
		}
	}
}