# Minutes and Days and year

    package MethodOverLoading;
    
    /**
     * Created by Adwiti on 6/8/2018.
     */
    public class MinutesDaysYearsCalculator {
        public static void main(String[] args) {
            printYearsAndDays(525600);
            printYearsAndDays(1051200);
            printYearsAndDays(561600);
            printYearsAndDays(3500);
        }
    
        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long minutesInADay = 60 * 24;
                long years;
                long days;
                long totalDays = minutes / minutesInADay;
                if (totalDays >= 365) {
                    years = totalDays / 365;
                    days = years * 365 >= totalDays ? years * 365 - totalDays : totalDays - years * 365;
                } else {
                    years = 0;
                    days = totalDays;
                }
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }
