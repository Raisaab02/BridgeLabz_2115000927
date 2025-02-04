class Book {
    private static String libraryName = "City Library";
    private final String isbn; // Unique identifier
    private String title;
    private String author;

    // Constructor using `this`
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instanceof check before displaying book details
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }
}

// **Testing the Book Class**
public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        Book book2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra");

        book1.displayDetails();
        book2.displayDetails();

        Book.displayLibraryName();
    }
}




