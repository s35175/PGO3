public class Reader {

    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;


    public Reader(String firstName, String lastName, String cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }


    public void printData() {
        System.out.println("Reader: " + firstName + " " + lastName + " (Card: " + cardNumber + ") - Borrowed Books: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

  
    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }
}