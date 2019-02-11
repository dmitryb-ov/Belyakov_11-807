public class Stack {
    private char[] arr;
    private int n = 0;//число эл-тов

    public Stack(int limit) {
        arr = new char[limit];
    }

    public void push(char c) {
        if (n == arr.length) {
            throw new IllegalStateException("Стек заполнен");
        }
        arr[n++] = c;
    }

    public char peek(char c){
        int num = 0;
        num = n-1;
        if (n == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[num];
    }

    public char pop() {
        if (n == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[--n];
    }

    public boolean isEmpty() {
        return n == 0;
    }
}
