import java.util.*;

public class BuiltInStack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Peek: "+st.peek());

        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.size());        
    }
}