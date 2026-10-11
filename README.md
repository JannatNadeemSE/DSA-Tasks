# DSA Task 2 — Java Implementations

This repository contains menu-driven Java programs for common Data Structures and Algorithms operations.

## Programs
1. `StackLinkedList.java` — Stack using a singly linked list.
2. `QueueLinkedList.java` — Queue using a singly linked list.
3. `Stack2DArray.java` — Stack stored in a 2D array (2 rows x 3 columns).
4. `Queue2DArray.java` — Linear queue stored in a 2D array (2 rows x 3 columns).
5. `CircularQueue.java` — Circular queue using a one-dimensional array.

## Important note
A circular queue is normally a queue implementation, not a stack implementation. The phrase “Stack and Queue using a Linked List, 2D Array and Circular Queue” can be interpreted in different ways. Confirm with the instructor if they intended a different set of implementations.

## How to run
Install a Java JDK, open a terminal in this folder, and compile a program:

```bash
javac StackLinkedList.java
java StackLinkedList
```

Replace `StackLinkedList` with `QueueLinkedList`, `Stack2DArray`, `Queue2DArray`, or `CircularQueue` to run another program.

The 2D-array examples use 2 rows and 3 columns, so their capacity is 6 values. The circular queue capacity is 5 values.
