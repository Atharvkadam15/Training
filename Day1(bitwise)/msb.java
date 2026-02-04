import java.util.Scanner;

public class msb {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number :");
        int n= sc.nextInt();
        int pos=0;
        while (n>1){
            n=n>>1;
            pos++;

        }
        int msb=1<<pos;
        System.out.println("MSB is at position:"+pos+" with value:"+msb);
    }
}
