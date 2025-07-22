
import java.util.*;

class SplitMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("SENTENCE : ");
        String Sentence = sc.nextLine();
        String[] Words = Sentence.split(" ");
        System.out.println("WORD : " + Words[0].trim());
        System.out.println("WORD : " + Words[1].trim());
        System.out.println("WORD: " + Words[2].trim());
    }
}
