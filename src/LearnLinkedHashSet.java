import java.util.*;
public class LearnLinkedHashSet {
    public static void main(String args[])
    {
        //insertion order iis maintained
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();

        lSet.add(45);
        lSet.add(53);
        lSet.add(89);
        lSet.add(78);

        System.out.println(lSet);
    }
}
