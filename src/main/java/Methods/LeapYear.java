package Methods;

/**
 * Created by Adwiti on 6/3/2018.
 */
public class LeapYear {
    /**
     * Requirement is
     * valid range of year is >=1 to <=9999
     * if valid calculate leap year
     */

    public static boolean isLeapYear(int year) {
        /**
         * check if the year passed is valid
         */
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1996));
        System.out.println(isLeapYear(2004));
    }
}
