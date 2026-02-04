public class toggle_nth_bit {
    public static void main(String[] args) {
        int num =56;
        int bit=3;
        int alpha;
        alpha=num^(1<<bit);
        System.out.println(alpha);
    }
}
