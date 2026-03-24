public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);
        Book b1 = new Book("The Hobbit", "Tolkien", 310, true);
        Book b2 = new Book("1984", "Orwell", 328, true);
        Book b3 = new Book("Dune", "Herbert", 412, true);
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        Reader reader = new Reader("John", "Doe", 101, 0);
        System.out.println("--- Initial State ---");
        library.printAvailableBooks();
        System.out.println("\n--- Borrowing '1984' ---");
        library.borrowBook("1984", reader);
        System.out.println("\n--- State After Borrowing ---");
        library.printAvailableBooks();
        reader.printData();
        System.out.println("\n--- Returning '1984' ---");
        library.returnBook("1984", reader);
        System.out.println("\n--- Final State ---");
        library.printAvailableBooks();
    }
}
