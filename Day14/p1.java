import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("a");
        String language= sc.nextLine();
        char firstletter = language.charAt(0);
        System.out.println(firstletter);
        sc.close();
    }
}

