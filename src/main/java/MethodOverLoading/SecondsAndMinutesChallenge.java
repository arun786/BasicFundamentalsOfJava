package MethodOverLoading;

/**
 * Created by Adwiti on 6/6/2018.
 */
public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        String durationString = getDurationString(61*60);
        System.out.println(durationString);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 && seconds > 59)) {
            return "Invalid Value";
        }

        int totalSeconds = minutes * 60 + seconds;
        int hours = totalSeconds / (60 * 60);
        int remainingSeconds = totalSeconds % (60 * 60);
        int leftMinutes = remainingSeconds / 60;
        int leftSeconds = remainingSeconds % 60;

        return hours + "h " + leftMinutes + "m " + leftSeconds + "s";
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
