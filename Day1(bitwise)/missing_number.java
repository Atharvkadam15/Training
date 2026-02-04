public class missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int n = arr.length + 1;

        int xorAll = 0;
        int xorArr = 0;

        // XOR from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all array elements
        for (int num : arr) {
            xorArr ^= num;
        }

        int missingNumber = xorAll ^ xorArr;

        System.out.println("Missing number is: " + missingNumber);

    }
}
