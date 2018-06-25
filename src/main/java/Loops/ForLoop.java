package Loops;

/**
 * Created by Adwiti on 6/24/2018.
 */
public class ForLoop {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 to " + (i) + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("----------------");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 to " + (i) + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return amount * (interest) / 100;
    }
}
