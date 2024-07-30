package queue;

public class Main {
    int [] arr;
    int front;
    int rear;
    int capacity;

    Main(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
    }

    boolean isFull(){
        return rear+1 == capacity;
    }

    void enQueue(int data){
        if(!isFull()){
            rear++;
            arr[rear] = data;
            System.out.println(arr[rear] + " added successfully.");
        }else{
            System.out.println("Queue is full.");
        }
    }

    boolean isEmpty(){
        return front > rear;
    }

    void deQueue(){
        if(!isEmpty()){
            System.out.println(arr[front] + " Remove successfully.");
            front++;
        }else{
            System.out.println("Queue is empty");
        }
    }

    void printQueue(){
        System.out.print("Print Data : [");
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Main myQueue = new Main(5);
        int data = 1;
        for(int i= 0; i<myQueue.capacity+1; i++){
            myQueue.enQueue(data);
            data++;
        }

        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();

        myQueue.printQueue();
    }
}
