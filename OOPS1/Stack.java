package OOPS1;
public class Stack {
    private int capacity;
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            throw new RuntimeException("stack is full");
        }
        stack[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("stack is underflow");
        }
        return stack[top--];
    }
}