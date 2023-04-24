package library;

import java.util.HashSet;
import java.util.HashMap;

public class Library {

	private HashSet<Book> bookTitles;
	private HashMap<String, Book> books; // Map of book titles to Books
	public HashMap<String, Customer> customers; // Map of customerId to Customer
	private HashMap<String, Employee> employees;// Map of employeeId to employee
	
	private Finance finance;//finance will have the budget for the library

	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
	}

	public Library() {
		bookTitles = new HashSet<>();
		books = new HashMap<>();
		customers = new HashMap<>();
		employees = new HashMap<>();
		populateBooks();
		populateEmployees();
		populateCustomers();
		finance = new Finance(100, 100);
		
		
	}

	public void addBook(String title, String genre, String author, double price) {
		Book book = new Book(title, genre, author, price);
		books.put(title, book);
		bookTitles.add(book);
	}
	public void checkoutBook(Book book) {
		bookTitles.remove(book);
		books.remove(book.getTitle());
	}
	public void returnBook(Book book) {
		bookTitles.add(book);
		books.put(book.getTitle(), book);
	}

	public boolean hasBook(String bookTitle) {
		boolean hasBook = false;
		for (Book book : bookTitles) {
			if (book.getTitle().equals(bookTitle)) {
				hasBook = true;
				break;
			}
		}
		if (hasBook) {
			System.out.println("We Have That Book!");
		} else {
			System.out.println("We DO NOT Have That Book.  "  + bookTitle);

		}
		return hasBook;
			
	}
	
/*	public void orderBook (Book book) {
		books.put(book.title, book);
		bookTitles.add(book);
		finance.decreaseFunds(book.price);
	}*/

	public Book findBook(String title) {
		return books.get(title);
	}

	public void addCustomer(String fname, String lname) {
		Customer customer = new Customer(fname, lname);
		customers.put(customer.getId(), customer);
	}
	public Customer getCustomer(String id) {
		return customers.get(id);
	}
	public Employee getEmployee(String id) {
		return employees.get(id);
	}
	

	public void addEmployee(String fname, String lname) {
		Employee employee = new Librarian(fname, lname);
		employees.put(employee.getEmployeeId(), employee);
	}
	
	private void populateEmployees () {
		addEmployee("Shreeya", "Chalasani");
		addEmployee("Shweta", "Sainathan");
		addEmployee("Lenny", "Keenan");
	}
	private void populateCustomers () {
		addCustomer("Princess","Diana");
		addCustomer("Liz", "Carlin");
		addCustomer("Alan", "Patel");
	}
	
	private void populateBooks () {
		addBook("Fundamentals of Wavelets","Goswami Jaideva","signal_processing",40.0);
		addBook("Data Smart","Foreman John","data_science",40.0);
		addBook("God Created the Integers","Hawking Stephen","mathematics",40.0);
		addBook("Superfreakonomics","Dubner Stephen","economics",40.0);
		addBook("Orientalism","Said Edward","history",40.0);
		addBook("Nature of Statistical Learning Theory The","Vapnik Vladimir","data_science",40.0);
		addBook("Integration of the Indian States","Menon V P","history",40.0);
		addBook("Drunkard's Walk The","Mlodinow Leonard","science",40.0);
		addBook("Image Processing & Mathematical Morphology","Shih Frank","signal_processing",40.0);
		addBook("How to Think Like Sherlock Holmes","Konnikova Maria","psychology",40.0);
		addBook("Data Scientists at Work","Sebastian Gutierrez","data_science",40.0);
		addBook("Slaughterhouse Five","Vonnegut Kurt","fiction",40.0);
		addBook("Birth of a Theorem","Villani Cedric","mathematics",40.0);
		addBook("Structure & Interpretation of Computer Programs","Sussman Gerald","computer_science",40.0);
		addBook("Age of Wrath The","Eraly Abraham","history",40.0);
		addBook("Trial The","Kafka Frank","fiction",40.0);
		addBook("Statistical Decision Theory","Pratt John","data_science",40.0);
		addBook("Data Mining Handbook","Nisbet Robert","data_science",40.0);
		addBook("New Machiavelli The","Wells H. G.","fiction",40.0);
		addBook("Physics & Philosophy","Heisenberg Werner","science",40.0);
		addBook("Making Software","Oram Andy","computer_science",40.0);
		addBook("Analysis Vol I","Tao Terence","mathematics",40.0);
		addBook("Machine Learning for Hackers","Conway Drew","data_science",40.0);
		addBook("Signal and the Noise The","Silver Nate","data_science",40.0);
		addBook("Python for Data Analysis","McKinney Wes","data_science",40.0);
		addBook("Introduction to Algorithms","Cormen Thomas","computer_science",40.0);
		addBook("Beautiful and the Damned The","Deb Siddhartha","nonfiction",40.0);
		addBook("Outsider The","Camus Albert","fiction",40.0);
		addBook("Complete Sherlock Holmes The - Vol I","Doyle Arthur Conan","fiction",40.0);
		addBook("Complete Sherlock Holmes The - Vol II","Doyle Arthur Conan","fiction",40.0);
		addBook("Wealth of Nations The","Smith Adam","economics",40.0);
		addBook("Pillars of the Earth The","Follett Ken","fiction",40.0);
		addBook("Mein Kampf","Hitler Adolf","nonfiction",40.0);
		addBook("Tao of Physics The","Capra Fritjof","science",40.0);
		addBook("Surely You're Joking Mr Feynman","Feynman Richard","science",40.0);
		addBook("Farewell to Arms A","Hemingway Ernest","fiction",40.0);
		addBook("Veteran The","Forsyth Frederick","fiction",40.0);
		addBook("False Impressions","Archer Jeffery","fiction",40.0);
		addBook("Last Lecture The","Pausch Randy","nonfiction",40.0);
		addBook("Return of the Primitive","Rand Ayn","philosophy",40.0);
		addBook("Jurassic Park","Crichton Michael","fiction",40.0);
		addBook("Russian Journal A","Steinbeck John","nonfiction",40.0);
		addBook("Tales of Mystery and Imagination","Poe Edgar Allen","fiction",40.0);
		addBook("Freakonomics","Dubner Stephen","economics",40.0);
		addBook("Hidden Connections The","Capra Fritjof","science",40.0);
		addBook("Story of Philosophy The","Durant Will","philosophy",40.0);
		addBook("Asami Asami","Deshpande P L","fiction",40.0);
		addBook("Journal of a Novel","Steinbeck John","fiction",40.0);
		addBook("Once There Was a War","Steinbeck John","nonfiction",40.0);
		addBook("Moon is Down The","Steinbeck John","fiction",40.0);
		addBook("Brethren The","Grisham John","fiction",40.0);
		addBook("In a Free State","Naipaul V. S.","fiction",40.0);
		addBook("Catch 22","Heller Joseph","fiction",40.0);
		addBook("Complete Mastermind The","BBC","nonfiction",40.0);
		addBook("Dylan on Dylan","Dylan Bob","nonfiction",40.0);
		addBook("Soft Computing & Intelligent Systems","Gupta Madan","data_science",40.0);
		addBook("Textbook of Economic Theory","Stonier Alfred","economics",40.0);
		addBook("Econometric Analysis","Greene W. H.","economics",40.0);
		addBook("Learning OpenCV","Bradsky Gary","data_science",40.0);
		addBook("Data Structures Using C & C++","Tanenbaum Andrew","computer_science",40.0);
		addBook("Computer Vision A Modern Approach","Forsyth David","data_science",40.0);
		addBook("Principles of Communication Systems","Taub Schilling","computer_science",40.0);
		addBook("Let Us C","Kanetkar Yashwant","computer_science",40.0);
		addBook("Amulet of Samarkand The","Stroud Jonathan","fiction",40.0);
		addBook("Crime and Punishment","Dostoevsky Fyodor","fiction",40.0);
		addBook("Angels & Demons","Brown Dan","fiction",40.0);
		addBook("Argumentative Indian The","Sen Amartya","nonfiction",40.0);
		addBook("Sea of Poppies","Ghosh Amitav","fiction",40.0);
		addBook("Idea of Justice The","Sen Amartya","nonfiction",40.0);
		addBook("Raisin in the Sun A","Hansberry Lorraine","fiction",40.0);
		addBook("All the President's Men","Woodward Bob","history",40.0);
		addBook("Prisoner of Birth A","Archer Jeffery","fiction",40.0);
		addBook("Scoop!","Nayar Kuldip","history",40.0);
		addBook("Ahe Manohar Tari","Deshpande Sunita","nonfiction",40.0);
		addBook("Last Mughal The","Dalrymple William","history",40.0);
		addBook("Social Choice & Welfare Vol 39 No. 1","Various","economics",40.0);
		addBook("Radiowaril Bhashane & Shrutika","Deshpande P L","nonfiction",40.0);
		addBook("Gun Gayin Awadi","Deshpande P L","nonfiction",40.0);
		addBook("Aghal Paghal","Deshpande P L","nonfiction",40.0);
		addBook("Maqta-e-Ghalib","Garg Sanjay","fiction",40.0);
		addBook("Beyond Degrees","Unknown","nonfiction",40.0);
		addBook("Manasa","Kale V P","nonfiction",40.0);
		addBook("India from Midnight to Milennium","Tharoor Shashi","history",40.0);
		addBook("World's Greatest Trials The","","history",40.0);
		addBook("Great Indian Novel The","Tharoor Shashi","fiction",40.0);
		addBook("O Jerusalem!","Lapierre Dominique","history",40.0);
		addBook("City of Joy The","Lapierre Dominique","fiction",40.0);
		addBook("Freedom at Midnight","Lapierre Dominique","history",40.0);
		addBook("Winter of Our Discontent The","Steinbeck John","fiction",40.0);
		addBook("On Education","Russell Bertrand","philosophy",40.0);
		addBook("Free Will","Harris Sam","philosophy",40.0);
		addBook("Bookless in Baghdad","Tharoor Shashi","nonfiction",40.0);
		addBook("Case of the Lame Canary The","Gardner Earle Stanley","fiction",40.0);
		addBook("Theory of Everything The","Hawking Stephen","science",40.0);
		addBook("New Markets & Other Essays","Drucker Peter","economics",40.0);
		addBook("Electric Universe","Bodanis David","science",40.0);
		addBook("Hunchback of Notre Dame The","Hugo Victor","fiction",40.0);
		addBook("Burning Bright","Steinbeck John","fiction",40.0);
		addBook("Age of Discontuinity The","Drucker Peter","economics",40.0);
		addBook("Doctor in the Nude","Gordon Richard","fiction",40.0);
		addBook("Down and Out in Paris & London","Orwell George","nonfiction",40.0);
		addBook("Identity & Violence","Sen Amartya","philosophy",40.0);
		addBook("Beyond the Three Seas","Dalrymple William","history",40.0);
		addBook("World's Greatest Short Stories The","","fiction",40.0);
		addBook("Talking Straight","Iacoca Lee","nonfiction",40.0);
		addBook("Maugham's Collected Short Stories Vol 3","Maugham William S","fiction",40.0);
		addBook("Phantom of Manhattan The","Forsyth Frederick","fiction",40.0);
		addBook("Ashenden of The British Agent","Maugham William S","fiction",40.0);
		addBook("Zen & The Art of Motorcycle Maintenance","Pirsig Robert","philosophy",40.0);
		addBook("Great War for Civilization The","Fisk Robert","history",40.0);
		addBook("We the Living","Rand Ayn","fiction",40.0);
		addBook("Artist and the Mathematician The","Aczel Amir","science",40.0);
		addBook("History of Western Philosophy","Russell Bertrand","philosophy",40.0);
		addBook("Selected Short Stories","","fiction",40.0);
		addBook("Rationality & Freedom","Sen Amartya","economics",40.0);
		addBook("Clash of Civilizations and Remaking of the World Order","Huntington Samuel","history",40.0);
		addBook("Uncommon Wisdom","Capra Fritjof","nonfiction",40.0);
		addBook("One","Bach Richard","nonfiction",40.0);
		addBook("Karl Marx Biography","","nonfiction",40.0);
		addBook("To Sir With Love","Braithwaite","fiction",40.0);
		addBook("Half A Life","Naipaul V S","fiction",40.0);
		addBook("Discovery of India The","Nehru Jawaharlal","history",40.0);
		addBook("Apulki","Deshpande P L","nonfiction",40.0);
		addBook("Unpopular Essays","Russell Bertrand","philosophy",40.0);
		addBook("Deceiver The","Forsyth Frederick","fiction",40.0);
		addBook("Veil: Secret Wars of the CIA","Woodward Bob","history",40.0);
		addBook("Char Shabda","Deshpande P L","nonfiction",40.0);
		addBook("Rosy is My Relative","Durrell Gerald","fiction",40.0);
		addBook("Moon and Sixpence The","Maugham William S","fiction",40.0);
		addBook("Political Philosophers","","philosophy",40.0);
		addBook("Short History of the World A","Wells H G","history",40.0);
		addBook("Trembling of a Leaf The","Maugham William S","fiction",40.0);
		addBook("Doctor on the Brain","Gordon Richard","fiction",40.0);
		addBook("Simpsons & Their Mathematical Secrets","Singh Simon","science",40.0);
		addBook("Pattern Classification","Duda Hart","data_science",40.0);
		addBook("From Beirut to Jerusalem","Friedman Thomas","history",40.0);
		addBook("Code Book The","Singh Simon","science",40.0);
		addBook("Age of the Warrior The","Fisk Robert","history",40.0);
		addBook("Final Crisis","","comic",40.0);
		addBook("Killing Joke The","","comic",40.0);
		addBook("Flashpoint","","comic",40.0);
		addBook("Batman Earth One","","comic",40.0);
		addBook("Crisis on Infinite Earths","","comic",40.0);
		addBook("Numbers Behind Numb3rs The","Devlin Keith","science",40.0);
		addBook("Superman Earth One - 1","","comic",40.0);
		addBook("Superman Earth One - 2","","comic",40.0);
		addBook("Justice League: Throne of Atlantis","","comic",40.0);
		addBook("Justice League: The Villain's Journey","","comic",40.0);
		addBook("Death of Superman The","","comic",40.0);
		addBook("History of the DC Universe","","comic",40.0);
		addBook("Batman: The Long Halloween","","comic",40.0);
		addBook("Life in Letters A","Steinbeck John","nonfiction",40.0);
		addBook("Information The","Gleick James","science",40.0);
		addBook("Journal of Economics vol 106 No 3","","economics",40.0);
		addBook("Elements of Information Theory","Thomas Joy","data_science",40.0);
		addBook("Power Electronics - Rashid","Rashid Muhammad","computer_science",40.0);
		addBook("Power Electronics - Mohan","Mohan Ned","computer_science",40.0);
		addBook("Neural Networks","Haykin Simon","data_science",40.0);
		addBook("Grapes of Wrath The","Steinbeck John","fiction",40.0);
		addBook("Vyakti ani Valli","Deshpande P L","nonfiction",40.0);
		addBook("Statistical Learning Theory","Vapnik Vladimir","data_science",40.0);
		addBook("Empire of the Mughal - The Tainted Throne","Rutherford Alex","history",40.0);
		addBook("Empire of the Mughal - Brothers at War","Rutherford Alex","history",40.0);
		addBook("Empire of the Mughal - Ruler of the World","Rutherford Alex","history",40.0);
		addBook("Empire of the Mughal - The Serpent's Tooth","Rutherford Alex","history",40.0);
		addBook("Empire of the Mughal - Raiders from the North","Rutherford Alex","history",40.0);
		addBook("Mossad","Baz-Zohar Michael","history",40.0);
		addBook("Jim Corbett Omnibus","Corbett Jim","nonfiction",40.0);
		addBook("20000 Leagues Under the Sea","Verne Jules","fiction",40.0);
		addBook("Batatyachi Chal","Deshpande P L","fiction",40.0);
		addBook("Hafasavnuk","Deshpande P L","fiction",40.0);
		addBook("Urlasurla","Deshpande P L","fiction",40.0);
		addBook("Pointers in C","Kanetkar Yashwant","computer_science",40.0);
		addBook("Cathedral and the Bazaar The","Raymond Eric","computer_science",40.0);
		addBook("Design with OpAmps","Franco Sergio","computer_science",40.0);
		addBook("Think Complexity","Downey Allen","data_science",40.0);
		addBook("Devil's Advocate The","West Morris","fiction",40.0);
		addBook("Ayn Rand Answers","Rand Ayn","philosophy",40.0);
		addBook("Philosophy: Who Needs It","Rand Ayn","philosophy",40.0);
		addBook("World's Great Thinkers The","","philosophy",40.0);
		addBook("Data Analysis with Open Source Tools","Janert Phillip","data_science",40.0);
		addBook("Broca's Brain","Sagan Carl","science",40.0);
		addBook("Men of Mathematics","Bell E T","mathematics",40.0);
		addBook("Oxford book of Modern Science Writing","Dawkins Richard","science",40.0);
		addBook("Justice Judiciary and Democracy","Ranjan Sudhanshu","philosophy",40.0);
		addBook("Arthashastra The","Kautiyla","philosophy",40.0);
	}

}
