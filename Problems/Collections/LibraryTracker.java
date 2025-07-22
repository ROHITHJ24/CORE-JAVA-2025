import java.util.*;

public class LibraryTracker {
    public static void main(String[] args) {
        HashSet<String> borrowedBooks = new HashSet<>();
        borrowedBooks.add("Java Programming");
        borrowedBooks.add("Data Structures");
        borrowedBooks.add("Java Programming");
        borrowedBooks.remove("Data Structures");
        System.out.println("Books borrowed: " + borrowedBooks);
        System.out.println("Is 'Java Programming' borrowed? " + borrowedBooks.contains("Java Programming"));
        borrowedBooks.clear();
        System.out.println("Cleared all borrowed books");
    }
}
