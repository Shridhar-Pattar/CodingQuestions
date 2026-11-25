package Armstrong;

public class armStrong {

    public static boolean isArmstrongNum(int a, int length) {
             
        int sum = 0;
        int n = a;
        int remainder = 0;
    
        for(int i =1; i<=length; i++){
           
            remainder = n % 10;
            sum = sum + (int)Math.pow(remainder,length);
            n = n/10;

        }
      return sum == a;
    }
     
    public static void main(String[] args) {
        int n = 371;
        int a = n;
        int length = 0;
        while (a!=0) {

        length++;
        a =a /10;

        } 
        
         System.out.println(isArmstrongNum(n, length));
        
    }
}
