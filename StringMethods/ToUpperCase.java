
import java.util.*;

class ToUpperCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CoupenCode = "JRM20";

        System.out.print("Enter coupen number : ");
        String InputCoupen = sc.nextLine();
        if (CoupenCode.equals(InputCoupen.toUpperCase())) {
            System.out.println("Valid coupen");
        } else {

            System.out.println("Invalid coupen");
        }
    }
}
