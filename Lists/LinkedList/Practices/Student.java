package Lists.LinkedList.Practices;

public class Student
{
    public String name, id, className;
    int section;

    public Student(String setName, String setId, String setClass, int setSection) {
        name = setName;
        id = setId;
        className = setClass;
        section = setSection;
    }

    public void printDetails() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Class  : " + className);
        System.out.println("Section: " + section);
    }
}
