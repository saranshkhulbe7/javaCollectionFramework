import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String args[])
    {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,8); //works nly on sorted arrays
        System.out.println(index);

        int arr[] = {10,2,7,4,3,6,0,8,1,9};
        Arrays.sort(arr);
        for(int e : arr)
        {
            System.out.println(e);
        }

        Arrays.fill(arr, 12);
        for(int e : arr)
        {
            System.out.println(e);
        }

    }
}
