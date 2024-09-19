import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.List;

public class TwoDimentionalArrayList {
    public static void main(String[] args) {
        // It's basically an ArrayList of ArrayLists lists
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println("================");
        System.out.println(ar1);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(sc.nextInt());ar2.add(sc.nextInt());ar2.add(sc.nextInt());
        System.out.println("================");
        System.out.println(ar2); 
        ArrayList<Integer> ar3 = new ArrayList<>();
        ar3.add(sc.nextInt()); ar3.add(sc.nextInt()); ar3.add(sc.nextInt());  
        sc.close();
        System.out.println("================");
        System.out.println(ar3); 
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(ar1); arr.add(ar2); arr.add(ar3);
        System.out.println("================");
        System.out.println(arr);
    }
}
