public interface IntList {
    //возвращает количество элементов
    int size();

    //возвращает true, если такой элемент есть у списка
    boolean contains(IntList intList, int index) throws IllegalAccessException;

    //добавляет новый элемент в конец списка
    void add(int e);

    //возвращает элемент по индексу
    int get(int index) throws IllegalAccessException;

    //удаляет элемент по индексу
    void remove(int index) throws IllegalAccessException;

    //сортирует элементы по возрастанию
    void sort(IntList intList) throws IllegalAccessException;

    //добавляет в конец все элементы из данного списка
    //начиная со startPosition
    void addAll(IntList intList, int startPosition) throws IllegalAccessException;

    //возвращает содержимое списка в виде массива
    int[] toArray();

    //возвращает индекс первого вхождения элемента с данными значениями
    int indexOf(int value);
}
