import java.util.Random; 
public class SwipeCard {

	private int meals; 
	private double cash;
	Random randNum = new Random(); 
	
	public SwipeCard() { 
		meals = randNum.nextInt(101) + 150; 
		cash = (double)randNum.nextInt(101) + 200;
	}
	
	public String toString() { 
		return "This swipe card has " + meals + " meals and " + cash + " dollars remaining.";
	}
	
	public int swipe() { 
		meals = meals - 1;
		return meals;
	}
	
	public double spend(double amt) { 
		cash = cash - amt; 
		return cash; 
	}
	
	public int getPossMeals(String mealType) { 
		String str1 = mealType; 
		String str2 = "meals";
		String str3 = "cash"; 
		String str4 = "both"; 
		
		if (str1.equals(str2)) { 
			System.out.print("This card has " + meals + " meals available.");
		}
		else if (str1.equals(str3)) { 
			final double COST_OF_MEAL = 5.79; 
			meals = (int) Math.round(cash / COST_OF_MEAL);
			System.out.println("This card has " + meals + " meals available from cash.");
		}
		else if (str1.equals(str4)) { 
			final double COST_OF_MEAL = 5.79;
			meals = meals + (int) Math.round(cash / COST_OF_MEAL);
			System.out.print("This card has " + meals + " meals available from cash and swipes.");
		}
		else {
			return -1;
		}
		return meals;  
		
	}
		
	
	public static void main(String[] args) {
		// could put into new and import a scanner 
		SwipeCard card1 = new SwipeCard(); 
		System.out.println(card1.toString());
		
		SwipeCard eat = new SwipeCard();
		System.out.println(eat.swipe()); 
		
		SwipeCard buy = new SwipeCard();
		double amt = 12.03; //plugged in, could make into a scanner and have it change.
		System.out.println(buy.spend(amt));
		
		SwipeCard remaining = new SwipeCard(); 
		String mealType = "cash"; //plugged in, could make into a scanner and have it change. 
		System.out.println(remaining.getPossMeals(mealType));
		
	
	}

}
