
import java.util.Scanner;

public class CharCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("occurs " + count + " times in your name.");
    }}
    