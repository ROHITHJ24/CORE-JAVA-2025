import java.util.*;

public class MarkOfStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tamil mark");
        int tamil = scan.nextInt();

        System.out.println("Enter English mark");
        int english = scan.nextInt();
        System.out.println("Enter Math mark");
        int math = scan.nextInt();
        System.out.println("Enter Science mark");
        int science = scan.nextInt();
        System.out.println("Enter Social mark");
        int social = scan.nextInt();

        int average = (tamil + english + math + science + social) / 5;
        System.out.println("Average mark is: " + average);
        int percentage = (tamil + english + math + science + social) * 100 / 500;
        System.out.println("Percentage : " + percentage + "%");

        // pass fail
        if (tamil < 35 || english < 35 || math < 35 || science < 35 || social < 35) {
            System.out.println("You are failed");
        } else {
            System.out.println("You are passed");
        }
        scan.close();
    }
}