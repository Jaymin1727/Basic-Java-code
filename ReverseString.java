import java.util.*;
public class ReverseString{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        if(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder result=new StringBuilder();
            for(int i=str.length()-1;i>=0;i--){
                result.append(str.charAt(i));
            }
            System.out.println("Reversed string: " + result);
        }
    }
}