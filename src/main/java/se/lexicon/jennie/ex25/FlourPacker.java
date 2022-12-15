package se.lexicon.jennie.ex25;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal <= 0) {
            return false;
        }

        if (bigCount == 0 && smallCount >= goal) {
            return true;
        }

        for(int i = 1; i <= bigCount; i++) {

            if(goal - (i*5) < 0) {
                return false;
            }

            if(goal - (i*5) <= smallCount) {
                return true;
            }
        }
        return false;
    }
}
