package SwitchStatement;

import java.util.Scanner;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * Created by Adwiti on 6/9/2018.
 */
public class SwitchBasics {

    public static void main(String[] args) {
        System.out.println("Please enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int switchValue = scanner.nextInt();
        switchStatementUsingInt(switchValue);
        System.out.println("Enter any letter...");
        char switchValueChar = scanner.next().charAt(0);
        switchStatementUsingChar(switchValueChar);
        System.out.println("Enter a byte value...");
        byte switchValueByte = scanner.nextByte();
        switchStatementUsingByte(switchValueByte);
        switchStatementUsingEnum(Days.MONDAY);


    }

    /**
     * Till java 7, int, short, byte and char was used in switch statement
     *
     * @param switchValue
     */
    public static void switchStatementUsingInt(int switchValue) {
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Any other value");
                break;
        }
    }

    public static void switchStatementUsingChar(char switchValue) {

        switch (switchValue) {
            case 'A':
            case 'a':
                System.out.println("value entered was a, A : " + switchValue);
                break;
            case 'B':
            case 'b':
                System.out.println("value entered was b, B :" + switchValue);
                break;
            default:
                System.out.println("value entered was " + switchValue);
                break;
        }
    }

    public static void switchStatementUsingByte(byte byteValue) {
        switch (byteValue) {
            case 1:
                System.out.println("byte value " + byteValue);
                break;
            case 2:
                System.out.println("Byte Value " + byteValue);
                break;
            default:
                System.out.println("Other value" + byteValue);
        }
    }

    public static void switchStatementUsingShort(short shortValue) {
        switch (shortValue) {
            case 1:
                System.out.println("short value : " + shortValue);
                break;
            case 2:
                System.out.println("short value : " + shortValue);
                break;
            default:
                System.out.println("Any value " + shortValue);
                break;
        }
    }

    /**
     * from java 1.7
     *
     * @param stringValue
     */
    public static void switchStatementUsingString(String stringValue) {
        switch (stringValue.toLowerCase()) {
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("any other day");
        }
    }

    public static void switchStatementUsingEnum(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;

        }
    }
}
