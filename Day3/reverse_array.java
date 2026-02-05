public class reverse_array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        System.out.println();
        class Solution {
            public void leftRotate(int[] nums, int k) {

                int n = nums.length;
                k = k % n;

                // Step 1: reverse first k elements
                for (int i = 0, j = k - 1; i < j; i++, j--) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                // Step 2: reverse remaining n-k elements
                for (int i = k, j = n - 1; i < j; i++, j--) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                // Step 3: reverse entire array
                for (int i = 0, j = n - 1; i < j; i++, j--) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
