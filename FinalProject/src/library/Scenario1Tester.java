
package library;

public class Scenario1Tester {
	

	

	public static void main(String[] args) {
		Library library = new Library();
		Scenario1Tester tester = new Scenario1Tester();
		tester.populateBooks(library);
		library.addCustomer("Shreeya", "Chalasani");
		Customer customer = new Customer("Shreeya", "Chalasani");
		customer.checkoutBook(library, "Data Smart");
		customer.checkoutBook(library, "Machine Learning for Hackers");
		customer.checkoutBook(library, "Making Software");
		customer.checkoutBook(library, "Beyond Degrees");
		customer.checkoutBook(library, "How to Think Like Sherlock Holmes");
		
		System.out.println("Checked out five books.");
		tester.printCustomerCheckouts(customer);
		
		System.out.println("Trying to check out 6th book. Error");
		
		customer.checkoutBook(library, "Let Us C");
		
		System.out.println("Returning one book.");
		customer.returnBook(library, "Making Software");
		

		tester.printCustomerCheckouts(customer);
		System.out.println("Trying to check out again. Should succeed.");

		customer.checkoutBook(library, "Let Us C");
		


		tester.printCustomerCheckouts(customer);


		

	}
	

	private void printCustomerCheckouts (Customer customer) {
		Checkout[] checkouts = customer.getCheckouts();
		int numCheckouts = customer.getNumberOfCheckouts();
		System.out.println ("Checkouts for customer: " + customer.getName());
		for (int i=0; i< numCheckouts; i++) {
			Checkout checkout = checkouts[i];
			Book book = checkout.getBook();
			System.out.print(" title:" + book.getTitle());
			System.out.print("  author:" + book.getAuthor());

			System.out.print (" checkoutDate:" + checkout.getCheckoutDate());
			System.out.print(" dueDate:" + checkout.getDueDate());
			System.out.println ("  lateFees:" + checkout.calculateLateFee());
			

		}
	}

	private void populateBooks (Library library) {
		library.addBook("Fundamentals of Wavelets","Goswami Jaideva","signal_processing",40.0);
		library.addBook("Data Smart","Foreman John","data_science",40.0);
		library.addBook("God Created the Integers","Hawking Stephen","mathematics",40.0);
		library.addBook("Superfreakonomics","Dubner Stephen","economics",40.0);
		library.addBook("Orientalism","Said Edward","history",40.0);
		library.addBook("Nature of Statistical Learning Theory The","Vapnik Vladimir","data_science",40.0);
		library.addBook("Integration of the Indian States","Menon V P","history",40.0);
		library.addBook("Drunkard's Walk The","Mlodinow Leonard","science",40.0);
		library.addBook("Image Processing & Mathematical Morphology","Shih Frank","signal_processing",40.0);
		library.addBook("How to Think Like Sherlock Holmes","Konnikova Maria","psychology",40.0);
		library.addBook("Data Scientists at Work","Sebastian Gutierrez","data_science",40.0);
		library.addBook("Slaughterhouse Five","Vonnegut Kurt","fiction",40.0);
		library.addBook("Birth of a Theorem","Villani Cedric","mathematics",40.0);
		library.addBook("Structure & Interpretation of Computer Programs","Sussman Gerald","computer_science",40.0);
		library.addBook("Age of Wrath The","Eraly Abraham","history",40.0);
		library.addBook("Trial The","Kafka Frank","fiction",40.0);
		library.addBook("Statistical Decision Theory","Pratt John","data_science",40.0);
		library.addBook("Data Mining Handbook","Nisbet Robert","data_science",40.0);
		library.addBook("New Machiavelli The","Wells H. G.","fiction",40.0);
		library.addBook("Physics & Philosophy","Heisenberg Werner","science",40.0);
		library.addBook("Making Software","Oram Andy","computer_science",40.0);
		library.addBook("Analysis Vol I","Tao Terence","mathematics",40.0);
		library.addBook("Machine Learning for Hackers","Conway Drew","data_science",40.0);
		library.addBook("Signal and the Noise The","Silver Nate","data_science",40.0);
		library.addBook("Python for Data Analysis","McKinney Wes","data_science",40.0);
		library.addBook("Introduction to Algorithms","Cormen Thomas","computer_science",40.0);
		library.addBook("Beautiful and the Damned The","Deb Siddhartha","nonfiction",40.0);
		library.addBook("Outsider The","Camus Albert","fiction",40.0);
		library.addBook("Complete Sherlock Holmes The - Vol I","Doyle Arthur Conan","fiction",40.0);
		library.addBook("Complete Sherlock Holmes The - Vol II","Doyle Arthur Conan","fiction",40.0);
		library.addBook("Wealth of Nations The","Smith Adam","economics",40.0);
		library.addBook("Pillars of the Earth The","Follett Ken","fiction",40.0);
		library.addBook("Mein Kampf","Hitler Adolf","nonfiction",40.0);
		library.addBook("Tao of Physics The","Capra Fritjof","science",40.0);
		library.addBook("Surely You're Joking Mr Feynman","Feynman Richard","science",40.0);
		library.addBook("Farewell to Arms A","Hemingway Ernest","fiction",40.0);
		library.addBook("Veteran The","Forsyth Frederick","fiction",40.0);
		library.addBook("False Impressions","Archer Jeffery","fiction",40.0);
		library.addBook("Last Lecture The","Pausch Randy","nonfiction",40.0);
		library.addBook("Return of the Primitive","Rand Ayn","philosophy",40.0);
		library.addBook("Jurassic Park","Crichton Michael","fiction",40.0);
		library.addBook("Russian Journal A","Steinbeck John","nonfiction",40.0);
		library.addBook("Tales of Mystery and Imagination","Poe Edgar Allen","fiction",40.0);
		library.addBook("Freakonomics","Dubner Stephen","economics",40.0);
		library.addBook("Hidden Connections The","Capra Fritjof","science",40.0);
		library.addBook("Story of Philosophy The","Durant Will","philosophy",40.0);
		library.addBook("Asami Asami","Deshpande P L","fiction",40.0);
		library.addBook("Journal of a Novel","Steinbeck John","fiction",40.0);
		library.addBook("Once There Was a War","Steinbeck John","nonfiction",40.0);
		library.addBook("Moon is Down The","Steinbeck John","fiction",40.0);
		library.addBook("Brethren The","Grisham John","fiction",40.0);
		library.addBook("In a Free State","Naipaul V. S.","fiction",40.0);
		library.addBook("Catch 22","Heller Joseph","fiction",40.0);
		library.addBook("Complete Mastermind The","BBC","nonfiction",40.0);
		library.addBook("Dylan on Dylan","Dylan Bob","nonfiction",40.0);
		library.addBook("Soft Computing & Intelligent Systems","Gupta Madan","data_science",40.0);
		library.addBook("Textbook of Economic Theory","Stonier Alfred","economics",40.0);
		library.addBook("Econometric Analysis","Greene W. H.","economics",40.0);
		library.addBook("Learning OpenCV","Bradsky Gary","data_science",40.0);
		library.addBook("Data Structures Using C & C++","Tanenbaum Andrew","computer_science",40.0);
		library.addBook("Computer Vision A Modern Approach","Forsyth David","data_science",40.0);
		library.addBook("Principles of Communication Systems","Taub Schilling","computer_science",40.0);
		library.addBook("Let Us C","Kanetkar Yashwant","computer_science",40.0);
		library.addBook("Amulet of Samarkand The","Stroud Jonathan","fiction",40.0);
		library.addBook("Crime and Punishment","Dostoevsky Fyodor","fiction",40.0);
		library.addBook("Angels & Demons","Brown Dan","fiction",40.0);
		library.addBook("Argumentative Indian The","Sen Amartya","nonfiction",40.0);
		library.addBook("Sea of Poppies","Ghosh Amitav","fiction",40.0);
		library.addBook("Idea of Justice The","Sen Amartya","nonfiction",40.0);
		library.addBook("Raisin in the Sun A","Hansberry Lorraine","fiction",40.0);
		library.addBook("All the President's Men","Woodward Bob","history",40.0);
		library.addBook("Prisoner of Birth A","Archer Jeffery","fiction",40.0);
		library.addBook("Scoop!","Nayar Kuldip","history",40.0);
		library.addBook("Ahe Manohar Tari","Deshpande Sunita","nonfiction",40.0);
		library.addBook("Last Mughal The","Dalrymple William","history",40.0);
		library.addBook("Social Choice & Welfare Vol 39 No. 1","Various","economics",40.0);
		library.addBook("Radiowaril Bhashane & Shrutika","Deshpande P L","nonfiction",40.0);
		library.addBook("Gun Gayin Awadi","Deshpande P L","nonfiction",40.0);
		library.addBook("Aghal Paghal","Deshpande P L","nonfiction",40.0);
		library.addBook("Maqta-e-Ghalib","Garg Sanjay","fiction",40.0);
		library.addBook("Beyond Degrees","Unknown","nonfiction",40.0);
		library.addBook("Manasa","Kale V P","nonfiction",40.0);
		library.addBook("India from Midnight to Milennium","Tharoor Shashi","history",40.0);
		library.addBook("World's Greatest Trials The","","history",40.0);
		library.addBook("Great Indian Novel The","Tharoor Shashi","fiction",40.0);
		library.addBook("O Jerusalem!","Lapierre Dominique","history",40.0);
		library.addBook("City of Joy The","Lapierre Dominique","fiction",40.0);
		library.addBook("Freedom at Midnight","Lapierre Dominique","history",40.0);
		library.addBook("Winter of Our Discontent The","Steinbeck John","fiction",40.0);
		library.addBook("On Education","Russell Bertrand","philosophy",40.0);
		library.addBook("Free Will","Harris Sam","philosophy",40.0);
		library.addBook("Bookless in Baghdad","Tharoor Shashi","nonfiction",40.0);
		library.addBook("Case of the Lame Canary The","Gardner Earle Stanley","fiction",40.0);
		library.addBook("Theory of Everything The","Hawking Stephen","science",40.0);
		library.addBook("New Markets & Other Essays","Drucker Peter","economics",40.0);
		library.addBook("Electric Universe","Bodanis David","science",40.0);
		library.addBook("Hunchback of Notre Dame The","Hugo Victor","fiction",40.0);
		library.addBook("Burning Bright","Steinbeck John","fiction",40.0);
		library.addBook("Age of Discontuinity The","Drucker Peter","economics",40.0);
		library.addBook("Doctor in the Nude","Gordon Richard","fiction",40.0);
		library.addBook("Down and Out in Paris & London","Orwell George","nonfiction",40.0);
		library.addBook("Identity & Violence","Sen Amartya","philosophy",40.0);
		library.addBook("Beyond the Three Seas","Dalrymple William","history",40.0);
		library.addBook("World's Greatest Short Stories The","","fiction",40.0);
		library.addBook("Talking Straight","Iacoca Lee","nonfiction",40.0);
		library.addBook("Maugham's Collected Short Stories Vol 3","Maugham William S","fiction",40.0);
		library.addBook("Phantom of Manhattan The","Forsyth Frederick","fiction",40.0);
		library.addBook("Ashenden of The British Agent","Maugham William S","fiction",40.0);
		library.addBook("Zen & The Art of Motorcycle Maintenance","Pirsig Robert","philosophy",40.0);
		library.addBook("Great War for Civilization The","Fisk Robert","history",40.0);
		library.addBook("We the Living","Rand Ayn","fiction",40.0);
		library.addBook("Artist and the Mathematician The","Aczel Amir","science",40.0);
		library.addBook("History of Western Philosophy","Russell Bertrand","philosophy",40.0);
		library.addBook("Selected Short Stories","","fiction",40.0);
		library.addBook("Rationality & Freedom","Sen Amartya","economics",40.0);
		library.addBook("Clash of Civilizations and Remaking of the World Order","Huntington Samuel","history",40.0);
		library.addBook("Uncommon Wisdom","Capra Fritjof","nonfiction",40.0);
		library.addBook("One","Bach Richard","nonfiction",40.0);
		library.addBook("Karl Marx Biography","","nonfiction",40.0);
		library.addBook("To Sir With Love","Braithwaite","fiction",40.0);
		library.addBook("Half A Life","Naipaul V S","fiction",40.0);
		library.addBook("Discovery of India The","Nehru Jawaharlal","history",40.0);
		library.addBook("Apulki","Deshpande P L","nonfiction",40.0);
		library.addBook("Unpopular Essays","Russell Bertrand","philosophy",40.0);
		library.addBook("Deceiver The","Forsyth Frederick","fiction",40.0);
		library.addBook("Veil: Secret Wars of the CIA","Woodward Bob","history",40.0);
		library.addBook("Char Shabda","Deshpande P L","nonfiction",40.0);
		library.addBook("Rosy is My Relative","Durrell Gerald","fiction",40.0);
		library.addBook("Moon and Sixpence The","Maugham William S","fiction",40.0);
		library.addBook("Political Philosophers","","philosophy",40.0);
		library.addBook("Short History of the World A","Wells H G","history",40.0);
		library.addBook("Trembling of a Leaf The","Maugham William S","fiction",40.0);
		library.addBook("Doctor on the Brain","Gordon Richard","fiction",40.0);
		library.addBook("Simpsons & Their Mathematical Secrets","Singh Simon","science",40.0);
		library.addBook("Pattern Classification","Duda Hart","data_science",40.0);
		library.addBook("From Beirut to Jerusalem","Friedman Thomas","history",40.0);
		library.addBook("Code Book The","Singh Simon","science",40.0);
		library.addBook("Age of the Warrior The","Fisk Robert","history",40.0);
		library.addBook("Final Crisis","","comic",40.0);
		library.addBook("Killing Joke The","","comic",40.0);
		library.addBook("Flashpoint","","comic",40.0);
		library.addBook("Batman Earth One","","comic",40.0);
		library.addBook("Crisis on Infinite Earths","","comic",40.0);
		library.addBook("Numbers Behind Numb3rs The","Devlin Keith","science",40.0);
		library.addBook("Superman Earth One - 1","","comic",40.0);
		library.addBook("Superman Earth One - 2","","comic",40.0);
		library.addBook("Justice League: Throne of Atlantis","","comic",40.0);
		library.addBook("Justice League: The Villain's Journey","","comic",40.0);
		library.addBook("Death of Superman The","","comic",40.0);
		library.addBook("History of the DC Universe","","comic",40.0);
		library.addBook("Batman: The Long Halloween","","comic",40.0);
		library.addBook("Life in Letters A","Steinbeck John","nonfiction",40.0);
		library.addBook("Information The","Gleick James","science",40.0);
		library.addBook("Journal of Economics vol 106 No 3","","economics",40.0);
		library.addBook("Elements of Information Theory","Thomas Joy","data_science",40.0);
		library.addBook("Power Electronics - Rashid","Rashid Muhammad","computer_science",40.0);
		library.addBook("Power Electronics - Mohan","Mohan Ned","computer_science",40.0);
		library.addBook("Neural Networks","Haykin Simon","data_science",40.0);
		library.addBook("Grapes of Wrath The","Steinbeck John","fiction",40.0);
		library.addBook("Vyakti ani Valli","Deshpande P L","nonfiction",40.0);
		library.addBook("Statistical Learning Theory","Vapnik Vladimir","data_science",40.0);
		library.addBook("Empire of the Mughal - The Tainted Throne","Rutherford Alex","history",40.0);
		library.addBook("Empire of the Mughal - Brothers at War","Rutherford Alex","history",40.0);
		library.addBook("Empire of the Mughal - Ruler of the World","Rutherford Alex","history",40.0);
		library.addBook("Empire of the Mughal - The Serpent's Tooth","Rutherford Alex","history",40.0);
		library.addBook("Empire of the Mughal - Raiders from the North","Rutherford Alex","history",40.0);
		library.addBook("Mossad","Baz-Zohar Michael","history",40.0);
		library.addBook("Jim Corbett Omnibus","Corbett Jim","nonfiction",40.0);
		library.addBook("20000 Leagues Under the Sea","Verne Jules","fiction",40.0);
		library.addBook("Batatyachi Chal","Deshpande P L","fiction",40.0);
		library.addBook("Hafasavnuk","Deshpande P L","fiction",40.0);
		library.addBook("Urlasurla","Deshpande P L","fiction",40.0);
		library.addBook("Pointers in C","Kanetkar Yashwant","computer_science",40.0);
		library.addBook("Cathedral and the Bazaar The","Raymond Eric","computer_science",40.0);
		library.addBook("Design with OpAmps","Franco Sergio","computer_science",40.0);
		library.addBook("Think Complexity","Downey Allen","data_science",40.0);
		library.addBook("Devil's Advocate The","West Morris","fiction",40.0);
		library.addBook("Ayn Rand Answers","Rand Ayn","philosophy",40.0);
		library.addBook("Philosophy: Who Needs It","Rand Ayn","philosophy",40.0);
		library.addBook("World's Great Thinkers The","","philosophy",40.0);
		library.addBook("Data Analysis with Open Source Tools","Janert Phillip","data_science",40.0);
		library.addBook("Broca's Brain","Sagan Carl","science",40.0);
		library.addBook("Men of Mathematics","Bell E T","mathematics",40.0);
		library.addBook("Oxford book of Modern Science Writing","Dawkins Richard","science",40.0);
		library.addBook("Justice Judiciary and Democracy","Ranjan Sudhanshu","philosophy",40.0);
		library.addBook("Arthashastra The","Kautiyla","philosophy",40.0);
	}
}
		