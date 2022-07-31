import java.util.*;
public class LearnHashSet {
    public static void main(String args[])
    {
        //unordered
//        Set<Integer> set = new HashSet<>();
//        set.add(45);
//        set.add(53);
//        set.add(89);
//        set.add(78);
//
//        System.out.println("set: " + set);
//
//        System.out.println("size: " + set.size());


        //using custom datatype

        Set<Student> stSet = new HashSet<>();

        stSet.add(new Student("Anuj", 2));
        stSet.add(new Student("Ramesh", 4));
        stSet.add(new Student("Shivam", 3));
        stSet.add(new Student("Rohit", 2));

        System.out.println(stSet);
    }
}
