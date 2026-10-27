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

    public void enqueue(Object data) {
        Node newNode = new Node();

        newNode.data = data;

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node temp = front;
        front = front.next;

        if (isEmpty()) {
            rear = null;
        }

        temp.next = null;

        return temp.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}