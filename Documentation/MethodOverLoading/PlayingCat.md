# Playing Cat

    package MethodOverLoading;
    
    /**
     * Created by Adwiti on 6/9/2018.
     */
    public class PlayingCat {
        /**
         * Requirement :
         * 1. cat will play in summer when temp is between 25 and 45(both inclusive)
         * 2. cat will play other than summer when temo is between 25 and 35 both inclusive
         *
         * @param isSummer
         * @param temperature
         * @return
         */
    
        public static boolean isCatPlaying(boolean isSummer, int temperature) {
            return isSummer ? temperature >= 25 && temperature <= 45 ? true : false : temperature >= 25 && temperature <= 35 ? true : false;
        }
    }
