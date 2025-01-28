package javapgms;

public class CompundSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "monday";
		
		switch(day)
		{
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("Weekdays");
			break;
		case "saturday":
		case "sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Not a day");
		}
		
		
	}

}
