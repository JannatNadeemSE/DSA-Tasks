import java.util.Scanner;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node front = null;
    static Node rear = null;
    static int size = 0;

    static void enqueue(int value) {
        Node node = new Node(value);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Value enqueued successfully.");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Dequeued value: " + front.data);
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front to rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- QUEUE USING LINKED LIST ---");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Size\n5. isEmpty\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                enqueue(sc.nextInt());
            } else if (choice == 2) {
                dequeue();
            } else if (choice == 3) {
                display();
            } else if (choice == 4) {
                System.out.println("Current queue size: " + size);
            } else if (choice == 5) {
                System.out.println(front == null ? "Queue is empty." : "Queue is not empty.");
            } else if (choice == 6) {
                System.out.println("Program ended.");
                sc.close();
                return;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
