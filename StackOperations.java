import java.util.Scanner;

public class StackOperations {
    static final int CAPACITY = 5;
    static int[] stack = new int[CAPACITY];
    static int top = -1;

    static void push(int value) {
        if (top == CAPACITY - 1) System.out.println("Stack Overflow! Stack is full.");
        else {
            top++;
            stack[top] = value;
            System.out.println("Value pushed successfully.");
        }
    }

    static void pop() {
        if (top == -1) System.out.println("Stack Underflow! Stack is empty.");
        else {
            System.out.println("Popped value: " + stack[top]);
            top--;
        }
    }

    static void display() {
        if (top == -1) System.out.println("Stack is empty.");
        else {
            System.out.println("Stack values (top to bottom):");
            for (int i = top; i >= 0; i--) System.out.println(stack[i]);
        }
    }

    static void size() { System.out.println("Current stack size: " + (top + 1)); }
    static void isEmpty() {
        if (top == -1) System.out.println("Stack is Empty.");
        else System.out.println("Stack is not Empty.");
    }
    static void isFull() {
        if (top == CAPACITY - 1) System.out.println("Stack is Full.");
        else System.out.println("Stack is not Full.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Size\n5. isEmpty\n6. isFull\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value to push: ");
                push(sc.nextInt());
            } else if (choice == 2) pop();
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
