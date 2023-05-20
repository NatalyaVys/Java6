//Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент,
 //метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.

import java.lang.reflect.Array;
import java.util.*;

public class HW6 {
    public static void main(String[] args) {

        mySet mySet = new mySet();

        for (int i = 0; i < 11; i++) {
            mySet.add(new Random().nextInt(20));
        }

        System.out.println(mySet.contains(7));
        System.out.println(Arrays.toString(mySet.toArray()));
        System.out.println();
        System.out.println(mySet.getItem(3));
        System.out.println();
        System.out.println(mySet.toString().trim());
    }
}

class mySet {

    static final Object OBJECT = new Object();
    private final LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num) {
        // HashSet<Integer> integers;
        return hashMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);
    }

    public Object[] toArray() {
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

    public String toString() {
        String str = "";
        for (Integer num : hashMap.keySet()) {
            str = str + " " + num.toString();

        }
        return str;
    }

}