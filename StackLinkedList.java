import java.util.Scanner;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node top = null;
    static int size = 0;

    static void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
        size++;
        System.out.println("Value pushed successfully.");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }
        System.out.println("Popped value: " + top.data);
        top = top.next;
        size--;
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- STACK USING LINKED LIST ---");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Size\n5. isEmpty\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                push(sc.nextInt());
            } else if (choice == 2) {
                pop();
            } else if (choice == 3) {
                display();
            } else if (choice == 4) {
                System.out.println("Current stack size: " + size);
            } else if (choice == 5) {
                System.out.println(top == null ? "Stack is empty." : "Stack is not empty.");
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
