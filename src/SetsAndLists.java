import java.util.HashSet;
import java.util.Set;

public class SetsAndLists {
    //Sets and Lists are from the Collections Interface in Java
    //Faster to Loop through a Set than an Array
    //HashSet - Standard, TreeSet - Ordered, LinkedHashSet
    static void main() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(-8);
        set.add(0);
        set.add(5);
        //set.remove(-8);
        int x = set.size();
        System.out.println(set);
    }
}
