import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dict {
    public static void main(String[] args) {
        // ! Hashmap
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 43);
        map.put("b", 45);

        // System.out.println(map.get("a"));

        // ! Treemap
        Map<String, Integer> tmap = new TreeMap<String, Integer>();

        tmap.put("a", 23);
        tmap.put("c", 24);
        tmap.put("b", 22);

        // System.out.println(tmap);

        // ! LinkedHashMap
        Map<String, Integer> lmap = new LinkedHashMap<String, Integer>();
        lmap.put("a", 23);
        lmap.put("c", 24);
        lmap.put("b", 22);

        System.out.println(lmap);
    }
}
