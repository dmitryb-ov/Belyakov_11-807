import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int count = 0;
    private int capacity; // вместимость
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        int length = 0;
        for (int i = 0; i < count; i++) {
            length++;
        }
        return length;
    }

    @Override
    public boolean contains(IntList intList, int index) {
        boolean output = false;
        for (int i = 0; i < count; i++) {
            if (elements[i] == index) {
                output = true;
                break;
            } else {
                output = false;
            }
        }
        return output;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) throws IllegalAccessException {
        if (index < 0 || index >= count) {
            throw new IllegalAccessException("No index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) throws IllegalAccessException {
        if (index < 0 || index >= count) {
            throw new IllegalAccessException("No index");
        }
        int[] numArr = new int[elements.length-1];
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                System.arraycopy(elements,index,numArr,0,index);
                System.arraycopy(elements,index+1,numArr,index,elements.length-index-1);
            }
        }
        elements = numArr;
        //elements[index] = 0;
        /*for (int i = index; i < count-1; i++) {
            elements[i] = elements[i+1];
            count--;
        }*/
        /*for (int i = 0; i < count; i++) {
            System.out.println(elements[i]);
        }*/
    }

    @Override
    public void sort(IntList intList) {
        for (int i = count-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(elements[j] > elements[j+1]){
                    int tmp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = tmp;
                }
            }
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) throws IllegalAccessException {
        for (int i = 0; i < intList.size(); i++) {
            if (startPosition >= count ||capacity == count) {
                grow();
            }
            elements[startPosition] = intList.get(i);
            startPosition++;
        }
    }

    @Override
    public int[] toArray() {
       /* String str = "";
        int[] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            str = str+elements[i]+" ";
        }
        String[] strArr = str.split(" ");
        for (int i = 0; i < count; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            //System.out.println(numArr[i]);
        }*/
       int numArr[] = new int [count];
       System.arraycopy(elements,0,numArr,0,count);
        return numArr;
    }

    @Override
    public int indexOf(int value) {
        int index = 0;
        for (int i = 0; i < count; i++) {
            if(elements[i] == value){
                index = i;
                break;
            }
        }
        return index;
    }
}
