package DataStructures.LinkedList;

public class Node {
    private int data;
    private Node getNext;

    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.getNext = next;
    }

    public int getData() {
        return this.data;
    }

    public Node getNext () {
        return this.getNext;
    }
}
