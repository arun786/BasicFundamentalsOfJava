package Methods;

/**
 * Created by Adwiti on 6/3/2018.
 */
public class TeenNumberCheck {
    /**
     * Requirement is if any number is between 13 and 19 both inclusive, should return true
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 > 12 && num1 < 20) || (num2 > 12 && num2 < 20) || (num3 > 12 && num3 < 20) ? true : false;
    }
}
