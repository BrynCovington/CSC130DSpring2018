import java.util.Random; 
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("*************************"); 
	System.out.println("* Bryn Covington"); 
	System.out.println("* Part 1"); 
	System.out.println("*************************");
	
	double myNum; 
	int v;
	char c; 
	
	Random rand1 = new Random(); 
	myNum = rand1.nextDouble(); 
	System.out.println(myNum); 
	v = 65 + (int)myNum;
	System.out.println("ASCII value is " + v);
	c = (char)v; 
	System.out.println("which is the same as " + c); 
	
	System.out.println("*************************"); 
	System.out.println("* Part 2"); 
	System.out.println("*************************");
	
	int temp; 
	
	Random rand2 = new Random();
	temp = rand2.nextInt(200) + -100; 
	
	System.out.println("Current temperature is " + temp + " F");
	
	if (temp >= 80) { 
		System.out.println("Turn the air conditioning on!");
	}
	else if ((temp >= 65) && (temp <= 79)) { 
		System.out.println("What a nice day!");
	}
	else if ((temp >= -49) && (temp <= 64)) { 
		System.out.println("Turn the heat on!");
	}
	else if (temp <= -50) {
		System.out.println("Your spit will freeze before it hits the ground!");
	}
	
	System.out.println("*************************"); 
	System.out.println("* Part 3"); 
	System.out.println("*************************");
	
	int initialHeading = 89; 

	Compass myCompass = new Compass(initialHeading); 
		Random rand3 = new Random(); 
		initialHeading = rand3.nextInt(91);
		myCompass.getHeading(); 
		System.out.println("Initial Heading is " + initialHeading + " degrees.");
		myCompass.rotate(10);
		initialHeading = initialHeading + 10;
		System.out.println("After rotating 10 degrees, heading is " + initialHeading + " degrees.");
		myCompass.rotate(1060);
		initialHeading = (initialHeading + 1060) % 360;
		System.out.println("After rotating 1060 degrees, heading is " + initialHeading + " degrees.");
		myCompass.rotate(-90);
		initialHeading = Math.abs(initialHeading + -90) % 360;
		System.out.println("After rotating -90 degrees, heading is " + initialHeading + " degrees.");
		
		
		// So overwhelmed I can't think straight anymore, driving me insane, did the best I could for part 3, so sorry. 
	 
		
		
	}

}
