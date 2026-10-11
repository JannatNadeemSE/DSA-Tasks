import java.util.Scanner;

public class ArrayOperations {
    static final int CAPACITY = 100;
    static int[] arr = new int[CAPACITY];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value\n2. Insert at index\n3. Fill array\n4. Delete last element\n5. Delete by index\n6. Display\n7. Search value\n8. Get value at index\n9. Replace/Update value at index\n10. Size\n11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (size == CAPACITY) System.out.println("Array is full!");
                else {
                    System.out.print("Enter value: ");
                    arr[size++] = sc.nextInt();
                    System.out.println("Value added successfully.");
                }
            } else if (choice == 2) {
                if (size == CAPACITY) System.out.println("Array is full!");
                else {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index < 0 || index > size) System.out.println("Invalid index!");
                    else {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        for (int i = size; i > index; i--) arr[i] = arr[i - 1];
                        arr[index] = value;
                        size++;
                        System.out.println("Value inserted successfully.");
                    }
                }
            } else if (choice == 3) {
                System.out.print("How many values do you want to add? ");
                int n = sc.nextInt();
                if (n < 0 || n > CAPACITY - size) System.out.println("Invalid number of values!");
                else {
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value " + (i + 1) + ": ");
                        arr[size++] = sc.nextInt();
                    }
                    System.out.println("Array filled successfully.");
                }
            } else if (choice == 4) {
                if (size == 0) System.out.println("Array is empty!");
                else System.out.println("Deleted value: " + arr[--size]);
            } else if (choice == 5) {
                if (size == 0) System.out.println("Array is empty!");
                else {
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();
                    if (index < 0 || index >= size) System.out.println("Invalid index!");
                    else {
                        System.out.println("Deleted value: " + arr[index]);
                        for (int i = index; i < size - 1; i++) arr[i] = arr[i + 1];
                        size--;
                        System.out.println("Value deleted successfully.");
                    }
                }
            } else if (choice == 6) {
                if (size == 0) System.out.println("Array is empty!");
                else {
                    System.out.print("Array: ");
                    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
                    System.out.println();
                }
            } else if (choice == 7) {
                System.out.print("Enter value to search: ");
                int search = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (arr[i] == search) {
                        System.out.println("Value found at index: " + i);
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Value not found.");
            } else if (choice == 8) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                if (index < 0 || index >= size) System.out.println("Invalid index!");
                else System.out.println("Value = " + arr[index]);
            } else if (choice == 9) {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                if (index < 0 || index >= size) System.out.println("Invalid index!");
                else {
                    System.out.print("Enter new value: ");
                    arr[index] = sc.nextInt();
                    System.out.println("Value updated successfully.");
                }
            } else if (choice == 10) {
                System.out.println("Current number of elements: " + size);
            } else if (choice == 11) {
                System.out.println("Program ended.");
                sc.close();
                return;
            } else System.out.println("Invalid choice!");
        }
    }
}
