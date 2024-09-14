import java.util.*;

public class ForLoops {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("========");
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(2, 12);
        map.put(3, 13);
        // 1
        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            System.out.print(value.getKey());
            System.out.print(" : ");
            System.out.println(value.getValue());
        }
        System.out.println("========");
        // 2
        Set<Integer> keys = map.keySet();
        for(int key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
