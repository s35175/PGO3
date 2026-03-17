public class Main {
    public static void main(String[] args) {

        Library library = new Library(5);
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);
        Book book2 = new Book("1984", "George Orwell", 328, true);
        Book book3 = new Book("Dune", "Frank Herbert", 412, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Reader reader1 = new Reader("John", "Doe", "C123");


        library.printAvailableBooks();


        System.out.println("\nBorrowing '1984'...");
        library.borrowBook("1984", reader1);


        System.out.println("\nState after borrowing:");
        library.printAvailableBooks();
        reader1.printData();

       
        System.out.println("\nReturning '1984'...");
        library.returnBook("1984", reader1);

        System.out.println("\nFinal State:");
        library.printAvailableBooks();
        reader1.printData();
    }
}