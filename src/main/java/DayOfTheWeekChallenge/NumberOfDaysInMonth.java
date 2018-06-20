package DayOfTheWeekChallenge;

/**
 * Created by Adwiti on 6/19/2018.
 */
public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(3000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2021));
        System.out.println(getDaysInMonth(-2, 2021));
        System.out.println(getDaysInMonth(-2, -2021));
        System.out.println(getDaysInMonth(10, 2020));
        System.out.println(getDaysInMonth(9, 2020));

    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 && year >= 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? true : false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (month == 2) {
            return 28;
        } else if (month < 8 && month % 2 == 0) {
            return 30;
        } else if (month > 8 && month % 2 != 0) {
            return 30;
        } else {
            return 31;
        }
    }
}
