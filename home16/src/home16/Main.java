public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        IntList list = new IntArrayList();
        list.add(45); //indexOf вернет 0
        list.add(42);
        list.add(55);
        //System.out.println("List get: "+list.get(0)); //45
        //System.out.println("List size: "+list.size()); // 3
        //System.out.println("List contains: "+list.contains(list,45));//true
        //list.remove(0);//list remote 0,42,55
        //list.sort(list);
        //list.indexOf(55); // 2
        System.out.println(list.toArray());
        IntList list2 = new IntArrayList();
        list2.add(45);
        list2.add(43);
        list2.add(46);// {43 44 45}
        //list.addAll(list2,3);
    }
}
