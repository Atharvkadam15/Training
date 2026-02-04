import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ; ");
        int num= sc.nextInt();
        int a=3;
        int b=5;
       if(num%a==0 & num%b==0){
           System.out.println("number is divisible by both a :"+a+" & b :"+b);
       }else if(num%a==0){
           System.out.println("num divisible only by a :"+a);
       } else if (num%b==0) {
           System.out.println("num divisible only by b :"+b);
       }
       else{
           System.out.println("number not divisible");
       }
    }

    }

