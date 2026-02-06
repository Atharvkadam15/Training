import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static void main(String[] args) {
        int[] arr={5,4,5,4,5,9};
        HashMap<Integer,Integer> count=new HashMap<>();

       //enhanced for loop
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:count.entrySet()){
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
