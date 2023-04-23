package library;

import java.util.HashSet;
import java.util.HashMap;

public class Library {

	private HashSet<String> bookTitles;
	private HashMap<String, Book> books; //Map of book titles to Books 
	public HashMap<String, Customer> customers; // Map of customerId to Customer
	private HashMap<String, Employee> employees;// Map of employeeId to employee
	
	public Library() {
		bookTitles = new HashSet<>();
		books = new HashMap<>();
		customers = new HashMap<>();
		employees = new HashMap<>();
	}
	
	public void addBook(String title, String genre, String author, double price) {
		Book book = new Book(title, genre, author, price);
		books.put(title, book);
		bookTitles.add(title);
	}
	
	public boolean hasBook(String bookTitle) { 
		if(bookTitles.contains(bookTitle)) {
			return true;
		}
		else 
			return false;
			}
	
	public Book findBook(String title) {
		return books.get(title);
	}
	
	public void addCustomer(String fname, String lname) {
		Customer customer = new Customer(fname, lname);
		customers.put(customer.getId(), customer);
	}
	
	public void addEmployee(String fname, String lname) {
		Employee employee = new Employee(fname, lname);
		employees.put(employee.getEmployeeId(), employee);
	}
	
	
}	
