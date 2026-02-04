public class set_nth_bit_to_1 {
    public static void main(String[] args) {
        int num=10;
        int bit=1;
        int result= num | (1<<bit);
        System.out.println(result);
    }
}
