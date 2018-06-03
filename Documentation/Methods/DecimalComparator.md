# Decimal Comparator

    package Methods;
    
    /**
     * Created by Adwiti on 6/3/2018.
     */
    public class DecimalComparator {
        /**
         * To compare two numbers to three decimal places
         */
        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
            int iNum1 = (int) (num1 * 1000);
            int iNum2 = (int) (num2 * 1000);
            return iNum1 == iNum2 ? true : false;
        }
    }
