package se.lexicon.jennie.ex17;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        } else if((number - 9) <= 0) {
            return number + number;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while(number > 0) {
            int digit = number % 10;
            number = number / 10;

            if(digit > 9) {
                continue;
            }
            firstDigit = digit;
        }
        return firstDigit + lastDigit;
    }
}
