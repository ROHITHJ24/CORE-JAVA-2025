
import java.util.*;

class StringIsEmpty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your feedback ");
        String feedBack = sc.nextLine();
        if (feedBack.isEmpty()) {
            System.out.println("Feed back Cant be empty");
        } else {
            System.out.println("Thank you");

        }

    }
}
