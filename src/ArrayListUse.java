import java.util.*;
public class ArrayListUse {
    public static void main(String args[])
    {
//        List<Integer> list = new ArrayList();
//        list.add(5);
//        list.add(6);
//        list.add(34);
//        list.add(98);

//       List<Integer> list2 = new ArrayList<>(Collections.nCopies(10, 1));
//       list2.addAll(list);
//       System.out.println(list2);


//        int arr[] = {1,3,5,7,9};
//        List<Integer> list = new ArrayList<>();
//        for(int e: arr)
//        {
//            list.add(e);
//        }
//        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        List<Integer> list= new ArrayList();
        for(int i=0; i<n; i++)
        {
            int e = sc.nextInt();
            list.add(e);
        }
        System.out.println(list);

    }
}
