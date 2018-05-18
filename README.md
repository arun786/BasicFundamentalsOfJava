# BasicFundamentalsOfJava

## Designing an interface

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
