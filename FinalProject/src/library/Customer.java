package library;

import java.util.Objects;

public class Customer {
	public static int nextCustomerNum=1;
	
	private Checkout[] checkouts = new Checkout[5];

	
	private String fname;
	private String lname;
	private String Id;
	private double lateFees = 0.0;
	private String name;
	
	private int numberOfCheckouts = 0;
	
	public Customer(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.name = lname + "," + fname;
		this.Id= ""+ nextCustomerNum++;
		
	}

	public String getName() {
		return name;
	}

	public boolean checkoutBook(Library library, String title) {
		if(numberOfCheckouts >= 5) {
			System.out.println("You cannot borrow more than 5 books. Please return some books.");
			return false;
		}
		Book book = library.findBook(title);
		if(book == null) {
			System.out.println("Sorry, we do not have that title " + title + " in our library collection");
			return false;
		}
		Checkout checkout = new Checkout(book);
		checkouts[numberOfCheckouts]= checkout;
		numberOfCheckouts++;
		

		
		return true;
	}
	
	public void returnBook(Library library, String title) {
		
		
		Checkout[] newcheckouts = new Checkout[5];
		int newCheckOutNums= 0; //creating new counter for returned books
		for (int i=0; i<numberOfCheckouts; i++) {
			Checkout checkout = checkouts[i];
			Book book = checkout.getBook(); 
			if(book.getTitle().equals(title)) {
				//Do nothing
				//check if this is the book being returned
				//see if late fees need to be charged
				lateFees += checkout.calculateLateFee();
			}
			else { // add the checkout to the new Array 
				newcheckouts[newCheckOutNums]= checkout;
				newCheckOutNums++;
			}
		}
		checkouts = newcheckouts;
		numberOfCheckouts = newCheckOutNums;// update number of checkouts by new counter
		
	}
	
	
	


	public static int getNextCustomerNum() {
		return nextCustomerNum;
	}

	public static void setNextCustomerNum(int nextCustomerNum) {
		Customer.nextCustomerNum = nextCustomerNum;
	}

	public Checkout[] getCheckouts() {
		return checkouts;
	}

	public void setCheckouts(Checkout[] checkouts) {
		this.checkouts = checkouts;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, lname, Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname);
	}

	public double getLateFees() {
		return lateFees;
	}

	public void setLateFees(double lateFees) {
		this.lateFees = lateFees;
	}

	public int getNumberOfCheckouts() {
		return numberOfCheckouts;
	}

	public void setNumberOfCheckouts(int numberOfCheckouts) {
		this.numberOfCheckouts = numberOfCheckouts;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	

}
