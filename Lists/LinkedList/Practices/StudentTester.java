package Lists.LinkedList.Practices;

import java.util.LinkedList;

public class StudentTester
{
    public static void main(String[] args) {
        // student linkedList
        LinkedList<Student> list = new LinkedList<>();

        // student creation
        Student s1 = new Student("Luffy", "CSE230", "UnderGrad", 14);
        Student s2 = new Student("Zoro", "CS231", "XI", 22);
        Student s3 = new Student("Nami", "BBA232", "X", 48);
        Student s4 = new Student("Robin", "ARC233", "PostGrad", 17);

        // adding students to the LinkedList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // display information
        for(Student s : list) {
            s.printDetails();
            System.out.println("=====================");
        }
    }
}
