package Stacks;

import java.util.Stack;

public class ImplQueue {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        System.out.println(myQueue.peek());

        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());

        System.out.println();
        System.out.println(myQueue.peek());
    }


}

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int ele = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return ele;
    }

    public int peek() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int ele = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return ele;
    }

    public boolean empty() {
    return first.isEmpty();
    }
}
