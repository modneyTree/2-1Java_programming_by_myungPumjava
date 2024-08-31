package chapter보충;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EnhancedForEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        for (int num = 0; num < list.size(); num++) {
            System.out.println(list.get(num));
        }
        for (String str : list) {
            System.out.println(str);
        }
        for (Iterator<String> i = list.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}