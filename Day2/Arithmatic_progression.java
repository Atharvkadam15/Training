public class Arithmatic_progression {
    public static void main(String[] args) {
        int a= 2;
        int n= 10;
        int diff=2;
        int term=a;
        for( int i=1; i<=n ; i++){
            System.out.print(term + " ");
            term = term + diff;

        }

    }
}
