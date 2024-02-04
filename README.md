[Library.pdf](https://github.com/ShreeyaChalasani/MIST4600FinalProject/files/14157295/Library.pdf)

We created a library application to run unique scenarios that occur in a library on the customer end and the librarian end. We used collection and object oriented programming to support various classes and methods in order to allow for scenarios like ordering books, checking out books, and returning books.

Scenario 1: Customer
- Goes through various steps to check out
- Checks for valid identification
- Checks how many books you are checking out as there is a 5 books checkout limit
- Checks if the books are currently available in the library to be checked out
- If all steps pass, books can be checked out and are removed from the book database
- Receipt with book title, author, check out date, return date, and late fees are provided

Scenario 2: Employee/Librarian 
- Various steps used to order a book
- Checks for valid employee identification
- Asks for book title, author, genre, and price inputs
- Checks if there are sufficient library funds
- If all steps pass, funds are decreased by book purchase price
- Ordered book are added to the book database
