
public class Account {

	private double balance; 
	private int secretPin = 1234; 
	
	public Account(double balance) { 
		this.balance = balance;
	}
	
	public double getBalance() { 
		return balance;
	}
	
	public void makeDeposit(double amountDeposit) { 
		balance = amountDeposit + balance;
	}
	
	public void makeWithdrawal(double amountWithdrawal) { 
		if (amountWithdrawal <= balance) {
			balance = balance - amountWithdrawal; 
		}
		
	}
	
	public String describeBalance() { 
		String description = null; 
		if (balance > 10000) { 
			description = "That's a comfortable balance.";
		}
		else if (balance > 1000) {
			description = "That's enough for rent and groceries.";
		}
		else if (balance > 100) {
			description = "Getting a bit low.";
		}
		else if (balance < 100) {
			description = "Time for a deposit!"; 
		}
		return description;
	}
	
	public String checkPin(int pin) { 
		if (pin == secretPin) { 
			return "Correct PIN recognized";
		}
		else { 
			return "Incorrect PIN";
		}
	}
	
	public void accumulateInterest(double interest) { 
		interest = interest * 100;
		balance = balance + interest;
	}

}
