public class Library {
    private Book[] books;
    private int bookCount;
public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }
public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full!");
        }
    }
public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }
public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(reader.getFirstName() + " borrowed: " + title);
        } else {
            System.out.println("Cannot borrow: " + title);
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(reader.getFirstName() + " returned: " + title);
        }
    }
}
