
import java.util.*;

class StringLastIndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String FileName = sc.nextLine();
        int lastIndex = FileName.lastIndexOf('.');
        System.out.println(lastIndex);
        if (lastIndex != -1 && lastIndex < FileName.length() - 1) {
            String extension = FileName.substring(lastIndex + 1);
            System.out.println("Extension is : " + extension);
        }
        else{

            System.out.println("Invalid");
        }
    }
}
