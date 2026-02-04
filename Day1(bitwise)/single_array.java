public class single_array {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,4,3};
        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Single number is: " + result);
    }
}
