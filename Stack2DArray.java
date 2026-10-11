import java.util.Scanner;

public class Stack2DArray {
    static final int ROWS = 2;
    static final int COLS = 3;
    static final int CAPACITY = ROWS * COLS;
    static int[][] stack = new int[ROWS][COLS];
    static int top = -1;

    static void push(int value) {
        if (top == CAPACITY - 1) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }
        top++;
        stack[top / COLS][top % COLS] = value;
        System.out.println("Value pushed successfully.");
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }
        System.out.println("Popped value: " + stack[top / COLS][top % COLS]);
        top--;
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i / COLS][i % COLS] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- STACK USING 2D ARRAY (2 x 3) ---");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Size\n5. isEmpty\n6. isFull\n7. Exit");
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
                System.out.println("Current stack size: " + (top + 1));
            } else if (choice == 5) {
                System.out.println(top == -1 ? "Stack is empty." : "Stack is not empty.");
            } else if (choice == 6) {
                System.out.println(top == CAPACITY - 1 ? "Stack is full." : "Stack is not full.");
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
