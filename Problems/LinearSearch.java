
import java.util.*;

class LinearSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        int nums[] = new int[n];
        int target = 6;
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        boolean found=false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                System.out.println("Element found at : " + i);
                found = true;
                break;
            }
        
        }
        if(found!=true){
            System.out.println("Not found");
        }

    }
}
