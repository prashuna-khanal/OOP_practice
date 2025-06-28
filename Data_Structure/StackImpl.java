package Data_Structure;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        //retrieves elements without removing from stack
        System.out.println(myStack.peek());
        //retrieves elements and removes from stack
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        //check if stack is empty
        System.out.println(myStack.isEmpty());

    }
}
