package lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class gg {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 150;
        Integer d = 150;

        System.out.println(a == b); //true
        System.out.println(c == d); //false

        // creating object of ArrayList<Character>
        List<Character> list = new ArrayList<Character>();

        // populate the list
        list.add('X');
        list.add('Y');

        // printing the list
        System.out.println("Initial list: " + list);

        // getting unmodifiable list
        // using unmodifiableCollection() method
        Collection<Character> immutablelist = Collections.unmodifiableCollection(list);

}
}
