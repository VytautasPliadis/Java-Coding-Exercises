public class DecimalComparator {
    public static long areEqualByThreeDecimalPlaces(double firstNumber) {
        long a = (long) firstNumber / 60;
//        int b = (int) (secondNumber * 1000);
        System.out.println(a);
//        System.out.println(b);
        return a;
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else return "Invalid value";
    }
}
