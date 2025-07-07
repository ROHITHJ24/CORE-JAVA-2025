import java.util.Scanner;

public class AlpabhetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (input.matches("[a-zA-Z]+")) {
            System.out.println("The string contains only alphabets.");
        } else {
            System.out.println("The string does not contain only alphabets.");
        }
        scanner.close();
    }
}