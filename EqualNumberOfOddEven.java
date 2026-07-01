    import java.util.Scanner;
    public class EqualNumberOfOddEven{
        public static int OddEvenCount(int arr[]){

            int oddcount=0,evencount=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    evencount++;
                }
                else{
                    oddcount++;
                }
            }
            return (oddcount==evencount)?arr.length:0;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of N: ");
            int n=sc.nextInt();
            int arr[]=new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();           
            }
            System.out.println(OddEvenCount(arr));
            
        }
    }