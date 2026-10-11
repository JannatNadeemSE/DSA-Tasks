import java.util.Scanner;

public class CircularQueue {
    static final int CAPACITY = 5;
    static int[] queue = new int[CAPACITY];
    static int front = 0;
    static int rear = -1;
    static int count = 0;

    static void enqueue(int value) {
        if (count == CAPACITY) {
            System.out.println("Circular Queue is full!");
            return;
        }
        rear = (rear + 1) % CAPACITY;
        queue[rear] = value;
        count++;
        System.out.println("Value enqueued successfully.");
    }

    static void dequeue() {
        if (count == 0) {
            System.out.println("Circular Queue is empty!");
            return;
        }
        System.out.println("Dequeued value: " + queue[front]);
        front = (front + 1) % CAPACITY;
        count--;
        if (count == 0) {
            front = 0;
            rear = -1;
        }
    }

    static void display() {
        if (count == 0) {
            System.out.println("Circular Queue is empty.");
            return;
        }
        System.out.print("Circular Queue (front to rear): ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % CAPACITY] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- CIRCULAR QUEUE ---");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Size\n5. isEmpty\n6. isFull\n7. Exit");
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
                System.out.println("Current queue size: " + count);
            } else if (choice == 5) {
                System.out.println(count == 0 ? "Queue is empty." : "Queue is not empty.");
            } else if (choice == 6) {
                System.out.println(count == CAPACITY ? "Queue is full." : "Queue is not full.");
            } else if (choice == 7) {
                System.out.println("Program ended.");
                sc.close();
                return;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
