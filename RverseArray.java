import java.util.Arrays;
import java.util.Scanner;

public class RverseArray {
    public  static void  reverseArray(int arr[]){
        int rev[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(rev));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter arrays: ");
        for(int i=0;i<n;i++){
            arr[i]=(int) sc.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Reversed Array: ");
        reverseArray(arr);        
    }
    
}
