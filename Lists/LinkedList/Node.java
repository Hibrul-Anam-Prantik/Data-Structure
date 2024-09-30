package Lists.LinkedList;

public class Node
{
    // Properties
    Node next;   // object
    int data;    // any type of data i.e.(String, char, double, float etc)

    // Constructors
    public Node(int newData) {
        data = newData;
        next = null;
    }

    public Node(int newData, Node newNext) {
        data = newData;
        next = newNext;
    }

    // methods
    // Getter & Setter
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
