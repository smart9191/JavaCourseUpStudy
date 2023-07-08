package uz.java.upstudy.lesson2;

public class MathUtils {
    public static long factorial(long n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n-1);
    }
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n-1);
    }


}
