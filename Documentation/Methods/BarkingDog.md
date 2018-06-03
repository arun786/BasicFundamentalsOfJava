# Barking Dog

    package Methods;
    
    /**
     * Created by Adwiti on 6/3/2018.
     */
    public class BarkingDog {
        /**
         * Requirement is
         * if dog barks between 8 and 22, returns false
         * valid range of hours is 0 to 23
         * if dog is not barking, return false
         *
         * @param args
         */
    
        public static void main(String[] args) {
    
            System.out.println(bark(true, 1));
            System.out.println(bark(false, 2));
            System.out.println(bark(true, 8));
            System.out.println(bark(true, -1));
        }
    
        public static boolean bark(boolean barking, int hourOfDay) {
            if ((hourOfDay < 0 || hourOfDay > 23)) {
                return false;
            }
            if (hourOfDay >= 8 && hourOfDay <= 22) {
                return false;
            }
            if (!barking) {
                return false;
            }
            return true;
        }
    }
