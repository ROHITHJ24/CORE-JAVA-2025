
import java.util.*;

class Books {

    int price = 500;
    String name = "Java Programming";

    void show() {
        System.out.println("From Books class");
        System.out.println("Price : " + price);
        System.out.println("Name : " + name);

    }
}

class Genre extends Books {

    void show(String genre, int price) {
        
   String genre[] ={"SCI","HORRO","COMEDY"}; 

    }
}

class Library {

    public static void main(String[] args) {
        Genre g = new Genre();
        Books b = new Books();
        b.show();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the genre of the book:");
        String genre = sc.next();
        System.out.println("Enter the price of the book:");
        int price = sc.nextInt();
        g.show(genre, price);
     
    }
}
