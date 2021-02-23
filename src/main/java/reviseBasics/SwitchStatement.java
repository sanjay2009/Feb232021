package reviseBasics;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String month = "arch";
		
		switch(month)
		{
			case "Jan":
				System.out.println("January");
				break;
			case "Feb":
				System.out.println("February");
				break;
			case "March":
				System.out.println("month is March");
				break;
			case "Jun":
				System.out.println("June");
				break;
			case "Jul":
				System.out.println("July");
				break;
			default:
				System.out.println("No match found");
		}

	}

}
