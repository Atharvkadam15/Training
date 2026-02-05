import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1 {

        public static void main(String[] args) throws Exception {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s= br.readLine();
            String arr[] = s.split(" ");
            int n1 = Integer.parseInt((arr[0]));
            int n2 = Integer.parseInt((arr[1]));
            int sum = n1 + n2;
            System.out.println(sum);
        }
    }

