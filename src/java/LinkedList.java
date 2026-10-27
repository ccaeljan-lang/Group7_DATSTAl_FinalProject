package java;

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
        Node newHead = new Node();

        // [PLACE HOLDER]: data assigning of head2
        // newHead.data = data

        if (head == null) {
            newHead.next = null;
        } else {
            newHead.next = head;
        }

        head = newHead;
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

    public int count() {
        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }
}
