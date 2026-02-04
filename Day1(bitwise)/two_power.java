import java.util.Scanner;

public class two_power {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            if ((n & (n - 1)) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

            sc.close();
        }
    }

