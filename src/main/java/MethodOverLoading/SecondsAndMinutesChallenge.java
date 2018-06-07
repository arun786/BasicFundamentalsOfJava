package MethodOverLoading;

/**
 * Created by Adwiti on 6/6/2018.
 */
public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        String durationString = getDurationString(61, 61);
        System.out.println(durationString);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int leftMinutes = minutes % 60;

        return hours + "h " + leftMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
