package collectionsReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergiu");
        map.put(2,"Moses");
        System.out.println(nonRepeatingChar("Java Developer"));
    }

    static Character nonRepeatingChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, Collections.frequency(Arrays.asList(str.split("")),c+""));
            if (map.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
