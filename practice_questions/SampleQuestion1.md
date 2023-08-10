**Question: Implement a Library Management System**

You are tasked with creating a Library Management System in Java. Your system should model books and library patrons, allowing patrons to borrow and return books. Implement the following classes and methods:

1. **Book Class:**
   - Fields:
     - `private int bookId`
     - `private String title`
     - `private String author`
     - `private boolean isBorrowed`

   - Constructor:
     - `public Book(int bookId, String title, String author)`

   - Methods:
     - `public int getBookId()`
     - `public String getTitle()`
     - `public String getAuthor()`
     - `public boolean isBorrowed()`
     - `public void borrow()`
     - `public void returnBook()`

2. **Patron Class:**
   - Fields:
     - `private int patronId`
     - `private String name`
     - `private List<Book> borrowedBooks`

   - Constructor:
     - `public Patron(int patronId, String name)`

   - Methods:
     - `public int getPatronId()`
     - `public String getName()`
     - `public void borrowBook(Book book)`
     - `public void returnBook(Book book)`
     - `public List<Book> getBorrowedBooks()`

3. **Library Class:**
   - Fields:
     - `private List<Book> books`
     - `private List<Patron> patrons`

   - Constructor:
     - `public Library()`

   - Methods:
     - `public void addBook(Book book)`
     - `public void addPatron(Patron patron)`
     - `public void borrowBook(int patronId, int bookId)`
     - `public void returnBook(int patronId, int bookId)`
     - `public List<Book> getAvailableBooks()`

Implement the classes and methods above. Ensure proper encapsulation and data hiding using appropriate access modifiers. Use the `this` keyword where necessary. Design a sample program that demonstrates the functionality of the Library Management System, including adding books, adding patrons, borrowing and returning books, and listing available books.

Note: You may assume that the necessary imports and additional methods not explicitly mentioned here are implemented as needed.
