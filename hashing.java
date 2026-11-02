import java.util.HashMap;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        
        HashMap<String ,Integer > map = new HashMap<>();

        map.put("Delhi" ,120);
        map.put("Punjab" ,190);
        map.put("Mumbai" ,150);


        // System.out.println(map) ;

        // if (map.containsKey("Delhi")){
        //     System.out.println("Found it");
        // }else{
        //     System.out.println("Not here");
        // }
        
        // System.out.println(map.get("Delhi"));
        // System.out.println(map.get("MP"));

        for(Map.Entry<String ,Integer> e: map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }

        map.remove("Punjab");
        System.out.println(map) ;

    }
}
