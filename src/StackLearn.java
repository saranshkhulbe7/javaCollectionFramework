import java.util.*;

public class StackLearn {
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        System.out.println("Stack: " + st);
        int n = st.search(4);
        for(int i=0; i<n-1; i++)
        {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println("Stack: " + st);
    }
}
