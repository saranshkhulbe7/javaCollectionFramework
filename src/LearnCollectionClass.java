import java.util.*;
public class LearnCollectionClass {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(34);
        list.add(9);
        list.add(98);
        list.add(45);
        list.add(9);

        int min = Collections.min(list);
        System.out.println("min : "+ min);

        int max = Collections.max(list);
        System.out.println("max : "+ max);

        int freq = Collections.frequency(list, 9);
        System.out.println("frequency of 9 in list : " + freq);

        Collections.sort(list); //ascending sorting
        System.out.println("ascending sorting : " + list);

        Collections.sort(list, Comparator.reverseOrder()); //descending sorting
        System.out.println("descending sorting : " + list);


        ArrayList<Student> stList = new ArrayList<>();
        stList.add(new Student("Anuj", 2));
        stList.add(new Student("Ramesh", 4));
        stList.add(new Student("Shivam", 3));
        stList.add(new Student("Rohit", 2));
        stList.add(new Student("Bala", 5));

        System.out.println(stList);
        Collections.sort(stList); //comparable s used here
        System.out.println(stList);

        Collections.sort(stList, new Comparator<Student> () {
            @Override
            public int compare(Student o1, Student o2)
            {
//                if return -ve [o1,o2] => [o1,o2]
//                if return +ve [o1,o2] => [o2,o1] //change position on +ve value
                return o1.name.compareTo(o2.name);
            }
        }); //comparator is used here
        System.out.println(stList);


    }
}
