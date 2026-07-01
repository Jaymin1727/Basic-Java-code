import java.util.*;

public class Prime{

    public static boolean isPrime(int n){
        if(n<=0){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number for checking prime or not: ");

        int n=sc.nextInt();
         if (isPrime(n)) {
            System.out.println(n + " is prime"); 
        } else {
            System.out.println(n + " is not prime");
        }
    }
}