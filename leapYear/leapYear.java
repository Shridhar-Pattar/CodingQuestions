package leapYear;
import java.util.Scanner;

public class leapYear {
    
public static void main(String[] args) {
    
 Scanner sc  = new Scanner(System.in);
       System.out.println("Please enter the number");
       int year = sc.nextInt();
    
       if (year%400==0 || year%4==0 && year%100!=0) {
            
        System.out.println("The Year " + year + "is a leap year");

       }
       else{
        System.out.println("Not a leap year");
       }
       sc.close();

}

}
