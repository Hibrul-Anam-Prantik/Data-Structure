package Lists.LinkedList;

import java.util.LinkedList;

public class PracticeI
{
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<>();
        countryNames.add("Bangladesh");
        countryNames.add("USA");
        countryNames.add("Pakistan");
        countryNames.add("England");
        countryNames.add("Canada");
        System.out.println("Country List: " + countryNames);
        System.out.println("==========================");

        System.out.println("Countries: ");
        for(String country : countryNames) {
            System.out.println(country);
        }
        System.out.println("Size of the Linked List: " + countryNames.size());
        System.out.println("==========================");

        countryNames.add(4, "Italy");
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.addFirst("Iran");
        countryNames.addLast("Russia");
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.remove("USA");
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.removeFirst();
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.removeLast();
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.remove(2);
        System.out.println("Updated List: " + countryNames);
        System.out.println("Updated List's size: " + countryNames.size());
        System.out.println("==========================");

        System.out.println("First Country: " + countryNames.getFirst());
        System.out.println("Last Country: " + countryNames.getLast());
        System.out.println("==========================");

        System.out.println("List Size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.remove(3);
        System.out.println(countryNames);
        System.out.println("==========================");

        countryNames.removeFirst();
        System.out.println(countryNames);
        System.out.println("==========================");

        countryNames.removeLast();
        System.out.println(countryNames);
        System.out.println("==========================");

        System.out.println("List Size: " + countryNames.size());
        System.out.println("==========================");

        countryNames.clear();
        System.out.println(countryNames);
        System.out.println("==========================");

    }
}