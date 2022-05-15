public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int initialNumber = number;
        int reverseNumber = 0;
        while (number !=0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return initialNumber == reverseNumber && initialNumber != 0;
    }
}
