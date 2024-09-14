import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Put
        map.put("A", 01);
        System.out.println(map);
        map.put("B", 02);
        System.out.println(map);
        map.put("A", 00);
        System.out.println(map);
        // Get
        System.out.println(map.get("A"));
        // Contains
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(0));
        System.out.println(map.containsValue(1));
    }
}
