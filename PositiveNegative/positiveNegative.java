package PositiveNegative;
import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        if (n>0) {
            System.err.println("The number is positive number");
            
        }
        else{
            System.out.println("The number is negative number");
        }




    }
}
