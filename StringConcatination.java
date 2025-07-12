
import java.util.*;

class StringConcatination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = scan.nextLine(); //get 1st name

        System.out.println("Enter Last name");
        String last = scan.nextLine(); //get 2nd name

        // first letter of first name to caps
        String firstLetter = first.substring(0, 1); //fist letter "h"
        firstLetter = firstLetter.toUpperCase(); //first letter to upper case "H"
        String remaining = first.substring(1, first.length()); //remaining letters "ello"
        String updated = firstLetter + remaining; //add both first caps and remaining letters "Hello"

        String Full = updated.concat(" " + last); //concat first and last name witha space "Hello+_+world"
        System.out.println("Full name : " + Full); //print full name "Hello world"
    }
}
