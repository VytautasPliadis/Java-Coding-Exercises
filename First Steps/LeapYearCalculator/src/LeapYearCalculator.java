public class LeapYearCalculator {
    public static boolean evenlyDivisible(int year, int dividers) {
        int divisionResult = year % dividers;
        return divisionResult == 0;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else return evenlyDivisible(year, 4) && evenlyDivisible(year, 100) && evenlyDivisible(year, 400);
    }
}