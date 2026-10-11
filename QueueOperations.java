import java.util.Scanner;

public class QueueOperations {
    static final int CAPACITY = 5;
    static int[] queue = new int[CAPACITY];
    static int front = 0;
    static int rear = -1;
    static int count = 0;

    static void enqueue(int value) {
        if (count == CAPACITY) System.out.println("Queue is Full!");
        else {
            rear = (rear + 1) % CAPACITY;
            queue[rear] = value;
            count++;
            System.out.println("Value enqueued successfully.");
        }
    }

    static void dequeue() {
        if (count == 0) System.out.println("Queue is Empty!");
        else {
            System.out.println("Dequeued value: " + queue[front]);
            front = (front + 1) % CAPACITY;
            count--;
        }
    }

    static void display() {
        if (count == 0) System.out.println("Queue is empty.");
        else {
            System.out.print("Queue (front to rear): ");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % CAPACITY;
                System.out.print(queue[index] + " ");
            }
            System.out.println();
        }
    }

    static void size() { System.out.println("Current queue size: " + count); }
    static void isEmpty() {
        if (count == 0) System.out.println("Queue is Empty.");
        else System.out.println("Queue is not Empty.");
    }
    static void isFull() {
        if (count == CAPACITY) System.out.println("Queue is Full.");
        else System.out.println("Queue is not Full.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Size\n5. isEmpty\n6. isFull\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value to enqueue: ");
                enqueue(sc.nextInt());
            } else if (choice == 2) dequeue();
            else if (choice == 3) display();
            else if (choice == 4) size();
            else if (choice == 5) isEmpty();
            else if (choice == 6) isFull();
            else if (choice == 7) {
                System.out.println("Program ended.");
                sc.close();
                return;
            } else System.out.println("Invalid choice!");
        }
    }
}
