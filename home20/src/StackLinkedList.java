import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedList<T> implements Iterable<T>{
   // private char[] arr;
    LinkedList<T> list = new LinkedList<>();
    private int n = 0;//число эл-тов

//    public StackLinkedList() {
//        list.add();
//    }

    public void push(T c) {
//        if (n == arr.length) {
//            throw new IllegalStateException("Стек заполнен");
//        }
//        arr[n++] = c;
        list.add(c);
    }

    public T pop() {
        T mem = list.getLast();
        if (list.getLast() == null) {
            throw new IllegalStateException("Stack is empty");
        }
        list.removeLast();
        return mem;
    }

    public boolean isEmpty() {
        if(list.getLast() == null){
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
