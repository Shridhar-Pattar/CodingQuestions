package greatestOfTwo;
import java.util.Scanner;

public class greatestOfTwo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();

        if (n1==n2) {
            System.out.println("First Number and second number is equal");
        }
        else if (n1>n2) {
            System.out.println("N1 Greater than N2");
        } 
        
        else {
            System.out.println("N1 smaller than N2");
            
        }
        sc.close();
       
         
    }

}
