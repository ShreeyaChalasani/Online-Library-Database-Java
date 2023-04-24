package library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Press 1 for Customer and 2 for Librarian. Done to exit");
		String line = scanner.nextLine();

		while (!line.equalsIgnoreCase("Done")) {
			if (line.equals("1")) {
				CustomerScenario.customerScenario(library, scanner);
			} else if (line.equals("2")) {
				LibrarianScenario.librarianScenario(library, scanner);
			} else {
				System.out.println("Invalid choice. Please try again.");
			}

			System.out.println("Press 1 for Customer and 2 for Librarian. Done to exit");
			line = scanner.nextLine();

		}

	}

}
