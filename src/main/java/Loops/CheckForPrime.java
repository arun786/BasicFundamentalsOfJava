package Loops;

/**
 * Created by Adwiti on 6/24/2018.
 */
public class CheckForPrime {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean b = isPrime(i);
            if (b) {
                System.out.println("Prime number " + i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
