# Covert inches to feet to centimeters

    package MethodOverLoading;
    
    /**
     * Created by Adwiti on 6/3/2018.
     */
    public class FeetInchesParameter {
        /**
         * Requirement is we need to create a
         * 1. method which takes in two parameters, first being feet (>=0) and second parameter in inches(>=0 and <=12)
         * if valid convert to cms else return -1
         * <p>
         * 2. overload the method and pass inches.
         * validate if it is greater than 0. and return -1 if not true
         * if true
         * 1. convert inches into feet.
         * 2. call the first overloaded method to pass the inches and feet.
         */
        /**
         * @param feet
         * @param inches
         * @return
         */
        public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
            if (feet < 0 || (inches < 0 || inches >= 12)) {
                return -1;
            }
            /**
             * 1 inch = 2.54 cm
             * 1 foot = 12 inches
             */
            return (inches + feet * 12) * 2.54;
        }
    
        public static double calcFeetAndInchesToCentimeters(double inches) {
            if (inches < 0) {
                return -1;
            }
    
            /**
             * covert to feet and inches
             */
            int feet = (int) (inches / 12);
            double newInches = feet > 0 ? inches - feet * 12 : inches;
            return calcFeetAndInchesToCentimeters(feet, newInches);
        }
    
        public static void main(String[] args) {
            double value = calcFeetAndInchesToCentimeters(1.0, 11);
            System.out.println(value);
            double newValue = calcFeetAndInchesToCentimeters(13);
            System.out.println(newValue);
        }
    }
