import java.util.*;
public class BuiltInQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.add(10);
        qu.add(20);
        qu.add(30);

        System.out.println("Peek: "+qu.peek());
        System.out.println(qu.remove());
        System.out.println("Peek: "+qu.peek());
        System.out.println(qu.size());
        
    }
    
}
