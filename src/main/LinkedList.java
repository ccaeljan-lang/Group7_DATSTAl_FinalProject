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

    public void insertNode(Object data) {
        Node newHead = new Node();

        newHead.data = data;

        if (head == null) {
            newHead.next = null;
        } else {
            newHead.next = head;
        }

        head = newHead;
    }

    public void deleteNode() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node tail = null;
        Node temp = head;

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