package library;

public class Finance {

	private double bookPurchaseBudget; 
	private double employeeWages;
	private double funds;
	
	
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
	
}
