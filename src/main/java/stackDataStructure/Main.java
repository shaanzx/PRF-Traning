package stackDataStructure;

public class Main {
    public static void main(String[] args) {
        // Create a Stack
        Main add = new Main(5);
        add.push("I");
        add.push("j");
        add.push("s");
        add.push("e");
        add.printStack();
        //add.pop();
        add.printStack();
    }

    int capacity;
    int top;
    String[] arr;

    Main(int size) {
        capacity = size;
        top = -1;
        arr = new String[capacity];
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void push(String data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = data;
            System.out.println(arr[top] + " added successfully.");
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top] + " removed successfully.");
            arr[top--] = null;
        }
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
