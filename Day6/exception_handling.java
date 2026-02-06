public class exception_handling {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("exception");

        }
        finally {
            System.out.println("code runs");
        }
    }
}
