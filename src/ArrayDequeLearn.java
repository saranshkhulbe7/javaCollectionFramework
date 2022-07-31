import java.util.*;
public class ArrayDequeLearn {
    public static void main(String args[])
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(46);
        adq.offer(12);
        //offerFirst(), offerLast(), pollFirst(), pollLast();
        System.out.println(adq);
        System.out.println("peekFirst(): " + adq.peekFirst());
        System.out.println("peekLast(): " + adq.peekLast());
    }
}
