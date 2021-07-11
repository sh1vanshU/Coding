

//Implementation of Stack class
public class Stack {

    private int top;
    private int capacity;
    private long[] stackArray;

    public Stack(){
        this.capacity = 100;
        this.top = -1;
        this.stackArray = new long[this.capacity];
    
    }
    public Stack(int s) {
        this.capacity = s;
        this.top = -1;
        this.stackArray = new long[this.capacity];
    }

    public void push(long data) {
        try {
            if (top == capacity-1) {
                throw new Exception("Stack capacity is full");
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        stackArray[++top] = data;
    }

    public long pop() {
        try {
            if (top == -1)
                throw new Exception("Stack doesn't contain any element");
        } catch (Exception e) {
            System.out.println(e);
            return Long.MIN_VALUE;
        }
        return stackArray[top--];
    }

    public long peek() {
        try {
            if (top == -1)
                throw new Exception("Stack doesn't contain any element");
        } catch (Exception e) {
            System.out.println(e);
            return Long.MIN_VALUE;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (top == capacity)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Stack theStack = new Stack(5);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(theStack.peek());
        System.out.println(theStack.pop());
        
        System.out.println("");
    }
}