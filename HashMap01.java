import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Put
        System.out.println("======================");
        map.put("A", 01);
        System.out.println(map);
        System.out.println("=====");
        map.put("B", 02);
        System.out.println(map);
        System.out.println("==========");
        map.put("C", 03);
        System.out.println(map);
        System.out.println("===============");
        map.put("A", 00);
        System.out.println(map);
        System.out.println("===============");
        // Get
        System.out.println(map.get("A"));
        System.out.println("==");
        // Contains
        System.out.println(map.containsKey("A"));
        System.out.println("=====");
        System.out.println(map.containsKey("a"));
        System.out.println("=====");
        System.out.println(map.containsValue(0));
        System.out.println("=====");
        System.out.println(map.containsValue(1));
        System.out.println("=====");
        // Remove
        map.remove("B");
        System.out.println(map);
        System.out.println("==========");
        map.put("B", 2);
        System.out.println(map);
        System.out.println("===============");
        // Print If Absent
        map.putIfAbsent("X", 100);
        System.out.println(map);
        System.out.println("======================");
        map.putIfAbsent("A", 99);
        System.out.println(map);
        System.out.println("======================");
        // Replace the key/value
        map.replace("X", 111);
        System.out.println(map);
        System.out.println("======================");
    }
}
