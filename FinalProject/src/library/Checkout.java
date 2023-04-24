package library;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Checkout {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private Book book;
	
	private static final double lateFee = .25;
	
	public Checkout(Book book) {
		super();
		this.book = book;
		
		checkoutDate = LocalDate.now();
		dueDate = checkoutDate.plusDays(10);
		//THIS IS FOR TESTING REMOVE THIS. CALCULATE LATE FEE
		//dueDate = checkoutDate.plusDays(-20);
		
	}

	public boolean isoverDue () {
		
		LocalDate currentDate = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(currentDate, dueDate);
		
		if (days < 0) { 
			return true;
		}
		else 
			return false;
	
		
	}
	
	
	public double calculateLateFee() {
		
		
		LocalDate currentDate = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between( currentDate,dueDate);
		
		if(days < 0) {
			return Math.abs(days) * lateFee;//calculate difference
		}
	 
		else {
			return 0;
		}

		
		
}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
