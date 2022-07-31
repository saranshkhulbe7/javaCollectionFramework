import java.util.*;

public class LearnLinkedListQueue {
    public static void main(String args[])
    {
        Queue<Integer> ll = new LinkedList<>();
        ll.offer(34);
        ll.offer(46);
        ll.offer(78);
        System.out.println(ll);
        ll.offer(58);
        System.out.println(ll);
    }
}
