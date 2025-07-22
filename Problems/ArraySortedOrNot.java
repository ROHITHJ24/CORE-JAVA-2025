
import java.util.*;

class ArraySortedOrNot {

    static boolean SortedOrNot(int[] arr, int n) {
     
        for (int i = 0; i < n-1; i++) {
            if ((arr[i + 1] < arr[i])) {
               
        return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of Array : " );
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
      
        if(SortedOrNot(arr,n)==true){

        System.err.print("Sorted Array :)" );
        }
        else{
        System.err.print("UnSorted Array :( " );
        }
    }
}
