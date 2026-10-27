package main;

public class Queue {
    Node front;
    Node rear;

    public class Node {
        Node next;
        Object data;

        Node() {
            next = null;
        }
    }

    public void enque(Object data) {
        Node newNode = new Node();

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Object deque() {
        if (front == null) {
            return null;
        }

        Node temp = front;
        front = front.next;
        temp.next = null;

        return temp.data;
    }
}
