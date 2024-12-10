package java;

import java.util.Scanner;

class Stack {
    static final int SIZE = 5;
    static int top = -1;
    static int Array[] = new int[SIZE];

    public static void main(String args[]) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------");
            System.out.println("Perform operations on the stack");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. End");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void push() {
        int x;
        Scanner scanner = new Scanner(System.in);
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Enter element to be added to the stack:");
            x = scanner.nextInt();
            top = top + 1;
            Array[top] = x;
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element: " + Array[top]);
            top = top - 1;
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements present in the stack:");
            for (int i = top; i >= 0; --i) {
                System.out.println(Array[i]);
            }
        }
    }
}
