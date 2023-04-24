package library;

import java.util.ArrayList;

public class Librarian extends Employee {

	public void orderBooks (Library library, ArrayList<Book> books) {//called second
		Finance finance = library.getFinance();
		for (Book book: books) {
			library.addBook(book.title, book.genre, book.author, book.price);	
			finance.decreaseFunds(book.price);
		}
		
		
	}
	public boolean checkFunds (Library library, ArrayList<Book> books) {//called first
		boolean hasFunds = false;
		double totalCost=0.0;//total cost of all books to be ordered initialized to 0
		for (Book book: books) {
			totalCost += book.price;
		}
		Finance finance = library.getFinance();
		double availableFunds = finance.getFunds();
		if (totalCost <= availableFunds)  {
			hasFunds = true;
		}
		else {
			hasFunds = false;
		}
		
		return hasFunds;
	}
	public Librarian(String fname, String lname) {
		super(fname, lname);//calls the employee constructor with fname,lname
		// TODO Auto-generated constructor stub
	}


}

