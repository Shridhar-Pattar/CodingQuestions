package PrimeInRange;
import java.util.ArrayList;
import java.util.List;

public class primeInRange {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    return false;

                }
            }

        }
        return true;

    }

    public static void isPrimeRange(int n1, int n2) {

        List<Integer> ar = new ArrayList<>();

        for (int i = n1; i < n2; i++) {

            if (isPrime(i) == true) {
                ar.add(i);
            }

        }
        System.out.println(ar);
    }

    public static void main(String[] args) {

        isPrimeRange(1, 100);

    }
}
