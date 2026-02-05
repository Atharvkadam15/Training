import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(34);
        list.set(1,50);

      //  System.out.println();
        int x=list.get(0);
        System.out.println(x);
    }
}
