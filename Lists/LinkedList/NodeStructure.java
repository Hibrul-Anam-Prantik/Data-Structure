package Lists.LinkedList;

public class NodeStructure
{
    Node head;
    private int size;

    NodeStructure() {
        this.size = 0;
    }

    class Node
    {
        String data;
        Node next;

        // Constructor
        Node(String data) {
            this.data = data;
            next = null;  // everytime a new node is created, the next node will always be null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        // 1st5 check is any linkedList exists or not/ is the head null
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head  =newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // print
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        // corner case -> list is empty
        if(head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        // cornerCase
        if(head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;
        // cornerCase ; if head.next == null -> lastNode = null; -> lastNode.next ;(null.next)!ERROR
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        // making an object of self class -> is a must while creating a LinkedList
        NodeStructure list = new NodeStructure();  // object of self class -> list
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        System.out.println("===============================================");

        list.addLast("List");
        list.printList();
        System.out.println("===============================================");
        list.addFirst("This");
        list.printList();
        System.out.println("===============================================");
        list.deleteFirst();
        list.printList();
        System.out.println("===============================================");
        list.deleteLast();
        list.printList();
        System.out.println("===============================================");
        System.out.println("List Size: " + list.getSize());
        System.out.println("===============================================");
        list.addFirst("This");
        list.printList();
        System.out.println("List Size: " + list.getSize());
        System.out.println("===============================================");
        list.addLast("list");
        list.printList();
        System.out.println("List Size: " + list.getSize());
        System.out.println("===============================================");
    }
}
