package ArmstrongInRange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class armStrongRange {

     public static int lengthOfInt(int a){
            int length = 0;
            while (a!=0) {
                length++;
                a = a/10;
            }
            return length;

     }

    public static void armStrongInRange(int n1, int n2) {
          
        List<Integer> ar = new ArrayList<>();

        for(int i = n1; i<=n2; i++){
         
            int length = lengthOfInt(i);
            int n =i;
            int sum =0;
            int rem = 0;
            while (n!=0) {
                rem = n % 10;
                sum = sum + (int)Math.pow(rem, length);
                n = n/10;
            }
            if (sum == i ) {
                ar.add(i);
            }
            else{
                continue;
            }

        }

        System.out.println(ar);

                
           

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First");
        int n1 = sc.nextInt();
        System.out.println("Enter Second");
        int n2 = sc.nextInt();


        armStrongInRange(n1, n2);
        sc.close();

    }
}
