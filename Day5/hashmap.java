import java.util.HashMap;
import java.util.Map;


public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> info=new HashMap<>();
        info.put(1,"atharv");
        info.put(3,"sumeet");
        info.put(2,"omkar");
        info.put(4,"vishal");
        for(Map.Entry<Integer,String> temp:info.entrySet()){
            System.out.println(temp.getKey()+" "+temp.getValue());
        }
    }
}
