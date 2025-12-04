package ph.com.bpi.hello;

public class Book {
    String titleBook; // attribute

    void read() { // method
        System.out.println("Reading my " + titleBook + " books");
    }

    public static void main(String[] args) {
        Book myBooks = new Book();
        myBooks.titleBook = "Programming";
        myBooks.read();
    }
}
