import java.util.Scanner;

public class Fibonacci {

    // Returns the n-th Fibonacci number iteratively
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int res = a + b;
            a = b;
            b = res;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find the N-th Fibonacci term: ");
        int n = sc.nextInt();

        System.out.println("The " + n + "-th Fibonacci number is: " + fib(n));
        
        sc.close();
    }
}