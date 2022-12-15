package se.lexicon.jennie.ex20;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if(a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if(lastA == lastB || lastA == lastC || lastB == lastC) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int a) {

        if(a >= 10 && a <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
