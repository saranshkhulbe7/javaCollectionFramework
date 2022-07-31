import java.util.*;
public class LearnHashMap {
    public static void main(String args[])
    {
        //unordered
        Map<String, Integer> mp = new HashMap<>();

        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("Four", 4);
        mp.put("Five", 5);
        System.out.println(mp);

        for(Map.Entry<String, Integer> e : mp.entrySet())
        {
            System.out.println(e);
        }

        for(String key : mp.keySet())
        {
            System.out.println(key);
        }
        for(Integer value : mp.values())
        {
            System.out.println(value);
        }

        System.out.println("containsKey('Five') : " + mp.containsKey("Five"));
        mp.remove("Five");
        System.out.println("containsKey('Five') : " + mp.containsKey("Five"));

        //isEmpty(), clear()
    }
}
