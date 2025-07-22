
import java.util.*;

class SecondLargestInArray {

    static int SecondMax(int[] arr, int n, int max) {
        Arrays.sort(arr);
        max = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != max) {
                max = arr[i - 1];
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of array");
        int max = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print(SecondMax(arr, n, max));

    }
}
