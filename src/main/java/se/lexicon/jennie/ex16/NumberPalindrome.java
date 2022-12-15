package se.lexicon.jennie.ex16;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if(number < 0) {
            number = number * -1;
        } else if (number < 10){
            return true;
        }

        int reverse = 0;
        int lastDigit = 0;
        int tempNum = number;

        while(tempNum > 0) {

            lastDigit = tempNum % 10;
            reverse = (reverse * 10) + lastDigit;
            tempNum = tempNum / 10;
        }

        // return number == reverse;

        if(number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
