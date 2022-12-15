package se.lexicon.jennie.ex22;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10) {
            return -1;
        }

        int commonDiv = 0;

        for(int div = 1; div < first || div < second; div++) {

            if((first % div == 0) && (second % div == 0)) {
                commonDiv = div;
            }
        }
        return commonDiv;
    }
}
