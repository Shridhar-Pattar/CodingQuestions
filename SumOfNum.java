import java.util.Scanner;

public class SumOfNum {
     
    public static void main(String[] args) {
        
       Scanner sc  = new Scanner(System.in);
       System.out.println("Please enter the number");
       int n = sc.nextInt();
       int sum = 0;
       
     // Using For Loop
     for(int i = 1; i<=n; i++){
            sum = sum +i;
     }
     
     //Using while loop
     int k = 1;   
     while (k<=n) {
        sum = sum +k;
        k++;
     }
     
     //using formula
      sum = n*(n+1)/2;
     
      System.out.println(sum);
        sc.close();
    
    }
}
