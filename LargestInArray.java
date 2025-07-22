
import java.util.Arrays;
import java.util.Scanner;

class LargestInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
