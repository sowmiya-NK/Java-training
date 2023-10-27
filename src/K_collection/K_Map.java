package K_collection;

import java.util.HashMap;
import java.util.Map;

public class K_Map {
    public static void main(String[] args) {

        Map<Integer,String> list = new HashMap<>();
        list.put(1,"10");
        list.put(2,"20");
        list.put(3,"30");
        list.put(4,"40");
        list.put(5,"50");

        list.replace(5,"90");//replace
        list.remove(3);//remove
        System.out.println(list.keySet());//display only keys
        System.out.println(list.get(3));
        System.out.println(list);


    }
}
