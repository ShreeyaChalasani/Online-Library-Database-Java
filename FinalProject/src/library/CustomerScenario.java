
package library;

import java.util.Scanner;

public class CustomerScenario {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		customerScenario(library, scanner);
	}

	public static void customerScenario(Library library, Scanner scanner) {
		System.out.println("Please Enter ID:");
		String id = scanner.nextLine();
		Customer customer = library.getCustomer(id);// looking up customer from the ID 
		if (customer == null) {
			System.out.println("Invalid customer ID. Please try again");
			return;
		}

		System.out.println("Welcome " + customer.getName());

		String choice = "";
		System.out.println("Enter 1 to checkout Books");
		System.out.println("Enter 2 to return Books");
		System.out.println("If you are done enter Done");

		choice =  scanner.nextLine();
		
		while (!choice.equalsIgnoreCase("Done")) {
			
	
			
			if (choice.equals("1")) {
				checkoutBooks(library, scanner, customer);
			}
			else if (choice.equals("2")) {
				returnBooks(library, scanner, customer);
	
			}
			System.out.println("Enter 1 to checkout Books");
			System.out.println("Enter 2 to return Books");
			System.out.println("If you are done enter Done");
	
			choice =  scanner.nextLine();
		}

	}

	public static void checkoutBooks(Library library, Scanner scanner, Customer customer) {
		System.out.println(
				"Input the book  you would like to check out and input Done when there are no more books that you would like to checkout.");

		String bookTitle = scanner.nextLine();
		while (!bookTitle.equalsIgnoreCase("Done")) {
			Boolean hasBook = library.hasBook(bookTitle);
			
			if (hasBook) {
				customer.checkoutBook(library, bookTitle);

			}
			System.out.println(
					"Input the book  you would like to check out and input Done when there are no more books that you would like to checkout.");

			bookTitle = scanner.nextLine();
		}

		System.out.println("Thank You. Below are the books that are checked out to you");
		printCustomerCheckouts(customer);
	}
	public static void returnBooks(Library library, Scanner scanner, Customer customer) {
		System.out.println(
				"Input the book  you would like to return  and input Done when there are no more books that you would like to return.");

		String bookTitle = scanner.nextLine();
		while (!bookTitle.equalsIgnoreCase("Done")) {
			
				customer.returnBook(library, bookTitle);


			
				System.out.println(
						"Input the book  you would like to return  and input Done when there are no more books that you would like to return.");
				bookTitle = scanner.nextLine();

			
		}

		System.out.println("Thank You. Below are the books that are checked out to you");
		printCustomerCheckouts(customer);
	}

	public void testCheckout() {
		Library library = new Library();
		CustomerScenario tester = new CustomerScenario();
		library.addCustomer("Shreeya", "Chalasani");
		Customer customer = new Customer("Shreeya", "Chalasani");
		customer.checkoutBook(library, "Data Smart");
		customer.checkoutBook(library, "Machine Learning for Hackers");
		customer.checkoutBook(library, "Making Software");
		customer.checkoutBook(library, "Beyond Degrees");
		customer.checkoutBook(library, "How to Think Like Sherlock Holmes");

		System.out.println("Checked out five books.");
		printCustomerCheckouts(customer);

		System.out.println("Trying to check out 6th book. Error");

		customer.checkoutBook(library, "Let Us C");

		System.out.println("Returning one book.");
		customer.returnBook(library, "Making Software");

		printCustomerCheckouts(customer);
		System.out.println("Trying to check out again. Should succeed.");

		customer.checkoutBook(library, "Let Us C");

		printCustomerCheckouts(customer);
		
	}

	private static void printCustomerCheckouts(Customer customer) {
		Checkout[] checkouts = customer.getCheckouts();
		int numCheckouts = customer.getNumberOfCheckouts();
		System.out.println("Checkouts for customer: " + customer.getName());
		for (int i = 0; i < numCheckouts; i++) {
			Checkout checkout = checkouts[i];
			Book book = checkout.getBook();
			System.out.print(" title:" + book.getTitle());
			System.out.print("  genre:" + book.getAuthor());

			System.out.print(" checkoutDate:" + checkout.getCheckoutDate());
			System.out.print(" dueDate:" + checkout.getDueDate());
			System.out.println("  lateFees:" + checkout.calculateLateFee());

		}
		System.out.println ();
	}

}
