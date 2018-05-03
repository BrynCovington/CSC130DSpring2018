//Changing Pennies Lab 3, February 22, 2018, Bryn Covington

import java.util.Scanner;
public class ChangingPennies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in); 

//part 1
System.out.println("Pennies:");
double Pennies = scnr.nextInt();
double Dollars; 
Dollars = Pennies / 100; 
System.out.println("Dollars: $" + Dollars );

//part 2 
int pennies2 = (int) Pennies; 
int quarters; 
int dimes; 
int nickles; 
int pennies;

quarters = pennies2 / 25; 
dimes = ((pennies2 - (quarters*25)) / 10); 
nickles = ((pennies2 - (quarters*25) - (dimes*10)) /5);
pennies = ((pennies2 - (quarters*25) - (dimes*10) - (nickles*5)) / 1); 


System.out.println("Conversions: ");
System.out.println(quarters + " quarters");
System.out.println(dimes + " dimes");
System.out.println(nickles + " nickles"); 
System.out.println(pennies + " pennies");

//part 3 
double qandd; 

qandd = quarters*0.25 + dimes*0.10; 

System.out.println("Counting only quarters and dimes, you have $" + qandd);

scnr.close();	
		
	}

}
