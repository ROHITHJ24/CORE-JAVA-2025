import java.util.Scanner;

public class ReverseWordsCLI {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String[] words = input.split(" ");

   // System.out.println(words);
        System.out.println("Reversed words:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
             if (i > 0) {
                 System.out.print(" ");
             }
        }
        System.out.println();

       
        scanner.close();
    }
}