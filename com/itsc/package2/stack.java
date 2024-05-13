package com.itsc.package2;

public class stack {
    int[] array;
    int top, capacity;

    public stack(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        array[++top] = num;
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

    public static void main(String[] args) {
        int size = 4;
        stack obj = new stack(size);
        obj.push(1);
        obj.push(3);
        obj.push(4);
        obj.pop();
        System.out.println(obj.peek());
        obj.push(5);
        obj.push(6);

        for(int i = 0; i < size; i++) {
            System.out.println(obj.pop());
        }
        System.out.println(obj.peek());
    }

}