public class armstrong_number {

    public static void main(String[] args) {

        int num = 153;
        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        // Step 1: Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = originalNum;

        // Step 2: Calculate sum of digits^digits
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Step 3: Compare
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}

