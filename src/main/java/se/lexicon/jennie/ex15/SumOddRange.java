package se.lexicon.jennie.ex15;

public class SumOddRange {

    public static boolean isOdd(int number) {

        if((number > 0) && (number % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if((end < start) || (end < 0) || (start < 0)) {
            return -1;
        }

        for(int i=start; i <= end; i++) {
            if((i >= start) && (i <= end) && (isOdd(i) == true)) {
                sum += i;
            }
        }
        return sum;
    }
}
