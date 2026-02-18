public class reverse_string {
    public static void main(String[] args) {
        String name = "Atharv";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);
    }
}

