package se.lexicon.jennie.ex6;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        a = a * 1000;
        b = b * 1000;

        if((long) a == (long) b) {
            return true;
        } else {
            return false;
        }
    }
}
