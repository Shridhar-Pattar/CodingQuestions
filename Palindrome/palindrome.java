package Palindrome;
public class palindrome {

    public static int getReverse(int n){

        int rev =0;
        int rem = 0;
        while (n!=0) {
            rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
    
    public static void isPalindrome(int n ){

       if (n == getReverse(n)) {
           System.out.println("Palindrome");
           
       }
       else{
        System.out.println("Not Palindrome");
       }


    }

    public static void main(String[] args) {
        
        isPalindrome(12121);

    }

}
