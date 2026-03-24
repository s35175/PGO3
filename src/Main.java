public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Book("The Hobbit", "Tolkien", 310, true));
        library.addBook(new Book("1984", "Orwell", 328, true));
        
        Reader reader = new Reader("Kerem", "Ozuak", "S35175");
        
        System.out.println("--- Scenario Start ---");
        library.printAvailableBooks();
        library.borrowBook("1984", reader);
        
        System.out.println("\n--- State After Borrowing ---");
        library.printAvailableBooks();
        reader.printData();
        
        library.returnBook("1984", reader);
        System.out.println("\n--- Final State ---");
        library.printAvailableBooks();
    }
}
