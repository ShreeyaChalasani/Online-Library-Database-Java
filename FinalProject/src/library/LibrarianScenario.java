
package library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarianScenario {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		librarianScenario(library, scanner);
	}

	public static void librarianScenario(Library library, Scanner scanner) {
		System.out.println("Please Enter ID:");
		String id = scanner.nextLine();
		Librarian librarian = (Librarian) library.getEmployee(id);//type casting type librarian
		if (librarian == null) {
			System.out.println("Invalid Employee ID. Please try again");
			return;
		}

		System.out.println("Welcome " + librarian.getName());

		String choice = "";
		System.out.println("Enter 1 to Add Customer");
		System.out.println("Enter 2 to Buy Books");
		System.out.println("Enter 3 to Add Funds");
		System.out.println("If you are done enter Done");
		choice =  scanner.nextLine();


		while (!choice.equalsIgnoreCase("Done")) {
			
			if (choice.equals("1")) {
				addCustomer(library, scanner, librarian);
			}
			else if (choice.equals("2")) {
				orderBooks (library, scanner, librarian);
			}
			else if (choice.equals("3")) {
				addFunds(library, scanner, librarian);			
			}
			System.out.println("Enter 1 to Add Customer");
			System.out.println("Enter 2 to Buy Books");
			System.out.println("Enter 3 to Add Funds");
			System.out.println("If you are done enter Done");
	
			choice =  scanner.nextLine();
		}

	}

	public static void addCustomer (Library library, Scanner scanner, Librarian librarian) {
		System.out.println("Enter the first name of the customer or Done");

		String fname = scanner.nextLine();
		while (!fname.equalsIgnoreCase("Done")) {
			System.out.println("Enter the last name of the customer");
			String lname = scanner.nextLine();
			library.addCustomer(fname, lname);
			System.out.println("Enter the first name of the customer or Done");
			fname = scanner.nextLine();
		}
	}
	public static void orderBooks(Library library, Scanner scanner, Librarian librarian) {
		System.out.println(
				"Input the book title you would like to order  and input Done when there are no more books that you would like to order.");

		
		ArrayList<Book> booksList = new ArrayList<Book>();
		String title = scanner.nextLine();
		while (!title.equalsIgnoreCase("Done")) {
				System.out.println("Enter the name of the author");
				String author = scanner.nextLine();
				System.out.println("Enter the genre  ");
				String genre = scanner.nextLine();
				
				System.out.println("Enter the price ");
				double price = scanner.nextDouble();
				title = scanner.nextLine();
				
				Book book = new Book(title, genre, author, price);
				booksList.add(book);
				System.out.println(
						"Input the book title you would like to order  and input Done when there are no more books that you would like to order.");

				
				
				title = scanner.nextLine();

		}

		Boolean hasFunds = librarian.checkFunds(library, booksList);
		Finance finance = library.getFinance();
		if (hasFunds) {
			System.out.println ("Library has enough funds to order these books");
			System.out.println ("Available funds before order " + finance.getFunds());
			librarian.orderBooks(library, booksList);
			System.out.println ("Book order complete ");

			System.out.println ("Available funds after order " + finance.getFunds());
			
		}
		else {
			System.out.println ("Sorry. Library Does not have enough funds to order these books");	
			System.out.println ("Available funds are  " + finance.getFunds());

			System.out.println ("Please add some funds and try again...");

		}
		
	}
	public static void addFunds (Library library, Scanner scanner, Librarian librarian) {
		
		
		
		Finance finance =  	library.getFinance();
		System.out.println("Available funds " + finance.getFunds());
		System.out.println("Enter the amount to add ");

		double fundsToAdd = scanner.nextDouble();
		String fname = scanner.nextLine();
		finance.addFunds(fundsToAdd);
		System.out.println("Available funds " + finance.getFunds());


	}
	

	
}
