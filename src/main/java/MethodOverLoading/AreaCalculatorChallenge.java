package MethodOverLoading;

/**
 * Created by Adwiti on 6/8/2018.
 */
public class AreaCalculatorChallenge {

    public double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return (3.14159) * radius * radius;
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
