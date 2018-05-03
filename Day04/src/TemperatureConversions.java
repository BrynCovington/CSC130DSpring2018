//Bryn Covington 2/8/18
import java.util.Scanner;
public class TemperatureConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
int userTemp; 
userTemp = scnr.nextInt();
System.out.println("Temp: " + userTemp); 
System.out.print(userTemp + " C is ");
System.out.println(((userTemp * 9)/5) + 32 + " F");
System.out.print(userTemp + " F is ");
System.out.println(((userTemp -32)*5) /9 + " C");
	}

}
