import java.util.*;
public class PriorityQueueLearn {
    public static void main(String args[])
    {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int ele;
        pq.offer(34);
        pq.offer(98);
        pq.offer(24);
        pq.offer(76);
        System.out.println(pq);
        ele = pq.peek();
        System.out.println(ele);
        pq.poll();
        System.out.println(pq);
        ele = pq.peek();
        System.out.println(ele);
    }
}
