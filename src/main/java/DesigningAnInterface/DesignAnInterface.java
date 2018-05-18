package DesigningAnInterface;

interface Fly {
    /**
     * variables are public static and final by default
     */
    int MAX_SPEED = 100;

    /**
     * static method can be declared inside interface
     */
    static double calculateSpeed(float distance, double time) {
        return distance / time;
    }

    /**
     * abstract method which throws an exception
     */
    int getWingSpan() throws Exception;

    /**
     * default method inside a variable, default is mandatory
     */
    default void land() {
        System.out.println("Animal is landing");
    }
}

/**
 * Created by Adwiti on 5/17/2018.
 */
public class DesignAnInterface {

    public static void main(String[] args) throws Exception {

        Fly fly = new Eagle();
        fly.getWingSpan();
        fly.land();

    }
}

class Eagle implements Fly {

    @Override
    public int getWingSpan() throws Exception {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is driving fast...");
    }
}