import java.util.ArrayList;
import java.util.List;

public class SampleQuestion1 {
  public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int bookId, String title, String author) {
      this.bookId = bookId;
      this.title = title;
      this.author = author;
      this.isBorrowed = false;
    }

    public int getBookId() {
      return bookId;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public boolean isBorrowed() {
      return isBorrowed;
    }

    public void borrow() {
      if (!isBorrowed) {
        isBorrowed = true;
        System.out.println("Book " + title + " has been borrowed");
      } else {
        System.out.println("Book " + title + " is already borrowed");
      }
    }

    public void returnBook() {
      if (isBorrowed) {
        isBorrowed = false;
        System.out.println("Book " + title + " has been returned");
      } else {
        System.out.println("Book " + title + " is not currently borrowed");
      }
    }
  }

  public class Patron {
    private int patronId;
    private String name;
    private List<Book> borrowedBooks;

    public Patron(int patronId, String name) {
      this.patronId = patronId;
      this.name = name;
      this.borrowedBooks = new ArrayList<>();
    }

    public int getPatronId() {
      return patronId;
    }

    public String getName() {
      return name;
    }

    public void borrowedBook(Book book) {
      borrowedBooks.add(book);
      book.borrow();
      System.out.println("Patron " + name + " has borrowed book " + book.getTitle());
    }

    public void returnBook(Book book) {
      if (borrowedBooks.contains(book)) {
        borrowedBooks.remove(book);
        book.returnBook();
        System.out.println("Patron " + name + " has returned book " + book.getTitle());
      } else {
        System.out.println("Patron " + name + " did not borrow book " + book.getTitle());
      }
    }

    public List<Book> getBorrowedBooks() {
      return borrowedBooks;
    }
  }

  public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
      books = new ArrayList<>();
      patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
      if (!books.contains(book)) {
        books.add(book);
        System.out.println("Added " + book.getTitle() + " to library");
      } else {
        System.out.println("Couldn't add " + book.getTitle() + " to library");
      }
    }

    public void addPatron(Patron patron) {
      if (!patrons.contains(patron)) {
        patrons.add(patron);
        System.out.println("Added patron " + patron.getName() + " to patron list");
      } else {
        System.out.println("Couldn't add " + patron.getName() + " to patron list");
      }
    }

    public void borrowBook(int patronId, int bookId) {
      Patron patron = findPatronById(patronId);
      Book book = findBookById(bookId);

      if (patron != null && book != null) {
        patron.borrowedBook(book);
      } else {
        System.out.println("Patron or book not found");
      }
    }

    public void returnBook(int patronId, int bookId) {
      Patron patron = findPatronById(patronId);
      Book book = findBookById(bookId);

      if (patron != null && book != null) {
        patron.returnBook(book);
      } else {
        System.out.println("Patron or book not found");
      }
    }

    public List<Book> getAvailableBooks() {
      List<Book> availableBooks = new ArrayList<>();
      for (Book book : books) {
        if (!book.isBorrowed()) {
          availableBooks.add(book);
        }
      }
      return availableBooks;
    }

    private Patron findPatronById(int patronId) {
      for (Patron patron : patrons) {
        if (patron.getPatronId() == patronId) {
          return patron;
        }
      }
      return null;
    }

    private Book findBookById(int bookId) {
      for (Book book : books) {
        if (book.getBookId() == bookId) {
          return book;
        }
      }
      return null;
    }
  }

  public static void main(String[] args) {
    Book book1 = new SampleQuestion1().new Book(1, "On Earth We're Briefly Gorgeous", "Ocean Vuong");
    Book book2 = new SampleQuestion1().new Book(2, "To Kill a Mockingbird", "Harper Lee");
    Book book3 = new SampleQuestion1().new Book(3, "1984", "George Orwell");

    Patron patron1 = new SampleQuestion1().new Patron(101, "Alice");
    Patron patron2 = new SampleQuestion1().new Patron(102, "Bob");

    Library library = new SampleQuestion1().new Library();

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addPatron(patron1);
    library.addPatron(patron2);

    library.borrowBook(101, 1);
    library.borrowBook(102, 2);
    library.borrowBook(101, 2);
    library.returnBook(101, 1);
    library.returnBook(102, 2);

    List<Book> availableBooks = library.getAvailableBooks();
    System.out.println("\nAvailable books:");
    for (Book book : availableBooks) {
      System.out.println(book.getTitle());
    }
  }
}