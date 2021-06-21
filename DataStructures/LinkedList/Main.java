package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(12);
        Node b = new Node(234);
        Node c = new Node(34);
        Node d = new Node(1010);

        head.setNext(b);
        b.setNext(c);
        c.setNext(d);

        printNodes(head);
    }

    // Printing the connected nodes.
    public static void printNodes(Node head) {
        if (head == null) System.out.println("");

        Node currentNode = head;

        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

}
