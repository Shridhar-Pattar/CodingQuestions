package Prime;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the number");
       int n = sc.nextInt();
       boolean isPrime = false;

       if (n<=1) {
        System.out.println("Not A Prime");
       }
       else{
       for(int i = 2; i<=Math.sqrt(n);i++){

           if (n%i==0) {
            isPrime = true;
            break;
            
           }
       }
           if (isPrime == true) {
                 System.out.println("Not a Prime Number");
           }
           else{
            System.out.println("Prime");
           }
    }
   sc.close();

    }
}
