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
            System.out.println("Added to library: " + book.getTitle());
        } else {
            System.out.println("Library is full!");
        }
    }


    public void printAvailableBooks() {
        System.out.println("--- Available Books ---");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }

    // Başlığa göre kitap bulma [cite: 66]
    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }


    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }


    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(reader + " successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Book is either not available or does not exist.");
        }
    }


    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println("Successfully returned '" + title + "'.");
        }
    }
}