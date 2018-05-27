package Methods;

/**
 * Created by Adwiti on 5/27/2018.
 */
public class ChallengeOnMethods {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Arun", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Sachin", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Rahul", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Sourav", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        return score >= 1000 ? 1 : score >= 500 ? 2 : score >= 100 ? 3 : 4;
    }
}
