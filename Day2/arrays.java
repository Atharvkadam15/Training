public class arrays {
    public static void main(String[] args) {
        int[] arr = {12, 7, 10};

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Factors of " + arr[i] + ": ");

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
