import java.util.*;
class Stack{
    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int val){
        if(top==capacity-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top]=val;
    }
    int pop(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        Stack st=new Stack(size);
        System.out.println("Enter element of stack: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            st.push(arr[i]);
        }
        System.out.println("Peek: "+st.peek());
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println("Peek: "+st.peek());
    }
    
}
