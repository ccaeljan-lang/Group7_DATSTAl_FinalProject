package main;

public class LinkedList {
    public class Node {
        Node next;
        Object data;

        Node() {
            next = null;
        }
    }

    Node head = null;

    public void insertNode() {
        Node head2 = new Node();

        // [PLACE HOLDER]: data assigning of head2
        // head2.data = data

        if (head == null) {
            head2.next = null;
        } else {
            head2.next = head;
        }

        head = head2;
    }

    public void deleteNode() {
        Node tail = new Node();
        Node temp = new Node();

        temp = head;

        while (temp.next != null) {
            tail = temp;
            temp = temp.next;
        }

        tail.next = null;
    }
}
