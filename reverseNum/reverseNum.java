package reverseNum;


public class reverseNum {
       
    public static int getReverseOfNum(int n){

        int reverseNum = 0;
        int remainder = 0;
        
        while (n!=0) {
              remainder = n%10;
              reverseNum = reverseNum * 10 + remainder;
              n = n/10;
        }
            return  reverseNum;
    }

    public static void main(String[] args) {
        
        System.out.println(getReverseOfNum(12345));

       


    }
}
