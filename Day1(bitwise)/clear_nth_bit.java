public class clear_nth_bit {
    public static void main(String[] args) {
        int num=15;
        int bit=2;
        int res= num & ~(1<<bit);
        System.out.println("number after clearing bit: "+res);
    }
}
