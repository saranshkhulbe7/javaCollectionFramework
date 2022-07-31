import java.util.*;
public class LearnTreeMap {
    public static void main(String args[])
    {
        //sorted order
        Map<String, Integer> tmp = new TreeMap<>();

        tmp.put("One", 1);
        tmp.put("Two", 2);
        tmp.put("Three", 3);
        tmp.put("Four", 4);
        tmp.put("Five", 5);
        System.out.println(tmp);

        for(Map.Entry<String, Integer> e : tmp.entrySet())
        {
            System.out.println(e);
        }
        for(String key : tmp.keySet())
        {
            System.out.println(key);
        }
        for(Integer value : tmp.values())
        {
            System.out.println(value);
        }

        System.out.println("containsKey('Five') : " + tmp.containsKey("Five"));
        tmp.remove("Five");
        System.out.println("containsKey('Five') : " + tmp.containsKey("Five"));

        //isEmpty(), clear()
    }
}
