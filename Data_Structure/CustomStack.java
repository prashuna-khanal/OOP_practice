package Data_Structure;

public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -999999;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -999999;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(3);

        cs.push(5);
        cs.push(10);
        cs.push(15);

        System.out.println("Top element: " + cs.peek());
        System.out.println("Is full? " + cs.isFull());

        System.out.println("Popped: " + cs.pop());
        System.out.println("Popped: " + cs.pop());

        System.out.println("Is empty? " + cs.isEmpty());
    }
}
