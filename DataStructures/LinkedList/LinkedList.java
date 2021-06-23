package DataStructures.LinkedList;

public class LinkedList {
    private Node head; // the head of the list
    private int size; // size of the linked list

    // constructor that take the head data as an argument
    public LinkedList(int data) {
        this.head = new Node(data);
        ++this.size;
    }

    public LinkedList() {} // empty contructor with no args to aviod errors

    // pop method
    public void pop(int index) {
        if (this.size > 1) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(afterPopped(index));
            --this.size;
        }
        else {
            System.out.println("Error: The size of the Linked List is 1");
        }
    }

    public int get(int index) {
        if (index == 0) return head.getData();
        else if (index <= size - 1 && index > 0) {
        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();

        return current.getData();
        }
        return 0;
    }
    // A method that returns the node that will be next
    private Node afterPopped(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
        }
        Node current = head;
        for (int i = 0; i < index + 1; i++)
            current = current.getNext();
        return current;
    }

    // Append an element method
    public void append(int data) {
        if (this.size == 0) {
            this.head = new Node(data);
        }
        else if (this.size == 1) {
            head.setNext(new Node(data));
        }
        else {
            lastNode().setNext(new Node(data));
        }
        ++this.size;
    }

    // It returns the lats node in the linked list
    private Node lastNode() {
        Node current = head;
        for (int i = 0; i < size-1; i++)
            current = current.getNext();
        return current;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String s = "[";
        Node current = head;
        for (int i = 0; i < size; i++) {
            s = (i!=size-1) ? s + current.getData() + ", " : s + current.getData(); 
            current = current.getNext();
        }
        s = s.trim();
        return s + "]";
    }
}
