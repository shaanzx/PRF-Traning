package stackDataStructure;

public class Main {
    public static void main(String[] args) {
        //Create a Stack
        Main add = new Main(5);
        add.push(10);
        add.push(20);
        add.push(30);
        add.push(40);
        add.push(50);
        add.printStack();
        add.pop();
        add.printStack();
    }
    int capacity;
    int top;
    int [] arr;
    int start;

    Main(int size){
        capacity = size;
        top = -1;
        arr = new int[capacity];
        start = 0;
    }
    boolean isFull(){
        return top == capacity-1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            arr[++top] = data;
            System.out.println(arr[top]+" added successfully.");
        }
    }
    boolean isEmpty(){
        return top == -1;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println(arr[top]+" remove successfully.");
            arr[top--] = 0;
        }
    }
    void printStack(){
        for(int i = 0;i<top;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
