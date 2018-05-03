import java.util.Scanner;

public class ObjectDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
	int userYear; 
	int userMonth; 
	int userDay; 
	
	System.out.println("Enter a Year: ");
	userYear=scnr.nextInt();
	System.out.println("Enter a Month: ");
	userMonth=scnr.nextInt();
	System.out.println("Enter a Day: "); 
	userDay=scnr.nextInt(); 
	
Day userBirth = new Day(userYear, userMonth, userDay);
Day userToday = new Day(); 

System.out.println("You have been alive for: " + userToday.daysFrom(userBirth) + " days.");

	}
	







	}

