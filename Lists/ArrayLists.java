package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();  // or
        // ArrayList<Integer> intList = new ArrayList<>(); ....... <> / <Object Type>

        // Add Elements
        intList.add(2);
        intList.add(4);
        intList.add(6);
        System.out.println(intList);
        System.out.println("====================");

        // Get Elements
        int num = intList.get(0); // list.get(index)
        System.out.println(num);
        System.out.println(intList.get(2));
        System.out.println("====================");

        // To Add Element in-between
        intList.add(1, 10); // list.add(index, element)
        System.out.println(intList);
        System.out.println("====================");

        // Set Elements
        intList.set(0, 9); // list.set(index, element)
        System.out.println(intList);
        System.out.println("====================");

        // Remove Elements
        intList.remove(2); // list.remove(index)
        System.out.println(intList);
        System.out.println("====================");

        // Size
        int size = intList.size();
        System.out.println("Size: " + size);
        System.out.println("====================");

        // Loops
        for (int i = 0; i < size; i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();
        System.out.println("====================");

        // Sorting
        Collections.sort(intList);
        System.out.println("Sorted List: " + intList);
        System.out.println("====================");

        // Another way of initializing
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Luffy", "Zoro", "Robin", "Shanks"));
        System.out.println(names);
        System.out.println("====================");
        names.set(3, "X");
        System.out.println(names);
        System.out.println("====================");
        names.add("Nami");
        System.out.println(names);
        System.out.println("====================");
        // ArrayList<Integer> ar = new ArrayList<>();
        // System.out.println(ar);
        // System.out.println("====================");
    }
}
