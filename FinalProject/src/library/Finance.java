package library;

public class Finance {

	private double bookPurchaseBudget; 
	private double employeeWages;
	private double funds;
	
	
	public Finance(double bookPurchaseBudget, double employeeWages) {
		super();
		this.bookPurchaseBudget = bookPurchaseBudget;
		this.employeeWages = employeeWages;
		this.funds = bookPurchaseBudget + employeeWages;
	}
	public double getBookPurchaseBudget() {
		return bookPurchaseBudget;
	}
	public void setBookPurchaseBudget(double bookPurchaseBudget) {
		this.bookPurchaseBudget = bookPurchaseBudget;
	}
	public double getEmployeeWages() {
		return employeeWages;
	}
	public void setEmployeeWages(double employeeWages) {
		this.employeeWages = employeeWages;
	}
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	} 
	
	public void decreaseFunds(double fundsToDecrease) {
		funds -= fundsToDecrease;
	}
	public void addFunds(double fundsToAdd) {
		funds += fundsToAdd;
	}
	
	
}
