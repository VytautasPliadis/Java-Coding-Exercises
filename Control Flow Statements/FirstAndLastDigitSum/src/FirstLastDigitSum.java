public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;

        } else {
//            int sum = 0;
            int lastDigit = number % 10;
            int origNumber = number;
            while(origNumber>=10){
                origNumber /=10;
            }
            return origNumber + lastDigit;
        }

    }
}
