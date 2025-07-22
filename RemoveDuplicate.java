
class RemoveDuplicate {

    public static void main(String[] args) {
        int nums[] = {3, 6, 4, 3, 3, 5};
        int val = 3;
      
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            }
            System.out.print(nums[i]+" ");
        }

    }
}
