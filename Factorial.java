import java.util.Scanner;
public class Factorial{

    public static int factorial(int n){
        for(int i=0;i<n;i++){
            if(n<=1){
                return 1;
            }else{
                return n*factorial(n-1);
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();   
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }

}