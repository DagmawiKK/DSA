package com.itsc.package3;
public class Stacklq {
     int[] array;
     int top, capacity;

    public Stacklq(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    static class QueueUsingStacks {
         Stacklq stack1;
         Stacklq stack2;

        public QueueUsingStacks(int size) {
            stack1 = new Stacklq(size);
            stack2 = new Stacklq(size);
        }

        public void enqueue(int item) {
            if (stack1.isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(item);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        // Dequeue operation
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Top element: " + queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Top element: " + queue.peek());

        //queue.enqueue(4);

        System.out.println("dequeued element: " + queue.dequeue());

        System.out.println(queue.dequeue());
    }

}
