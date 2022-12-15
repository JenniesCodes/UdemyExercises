package se.lexicon.jennie.ex19;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if(a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int aFirstDigit = a / 10;
        int aSecondDigit = a % 10;
        int bFirstDigit = b / 10;
        int bSecondDigit = b % 10;

        if(aFirstDigit == bFirstDigit || aFirstDigit == bSecondDigit || aSecondDigit == bFirstDigit || aSecondDigit == bSecondDigit) {
            return true;
        } else {
            return false;
        }
    }
}
