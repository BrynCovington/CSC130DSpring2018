package day3;
import java.util.Scanner;
public class classwork3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int firstNum; 
		int secondNum; 
		firstNum = scnr.nextInt();
		secondNum = scnr.nextInt();
		System.out.println(firstNum + " + " + secondNum + " = "  + (firstNum + secondNum)); 
		System.out.println(firstNum + " - " + secondNum + " = "  + (firstNum - secondNum)); 
		System.out.println(firstNum + " * " + secondNum + " = "  + (firstNum * secondNum)); 
		System.out.print(firstNum + " / " + secondNum + " = "  + (firstNum / secondNum)); 
		System.out.print("(remainder " + (firstNum % secondNum) + ")");
	}

}
