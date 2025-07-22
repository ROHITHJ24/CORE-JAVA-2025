
import java.util.*;

class Calculator {
//wrong program
    void choice(int ch) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum: " + (a + b));
                break;
            case 2:
                System.out.println("Difference: " + (a - b));
                break;
            case 3:
                System.out.println("Product: " + (a * b));
                break;
                
            case 4:

                System.out.println("Division: " + (a / b));
                break;

            case 5:
                System.out.println("Exiting the calculator.");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        // calc.choice();
        while (true) {
            System.out.println("Enter your choice: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Exit");
            int ch = scan.nextInt();
            calc.choice(ch);
        }
    }
}
