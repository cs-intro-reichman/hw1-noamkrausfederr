// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		//If the time ranges of AM and PM are 12 hours, and i want to stay in the AM hours, i
		//need to deduct the PM hours by 12
		if (hours >= 12) hours-=12;

		System.out.println(hours + ":" + minutes);

	}
}