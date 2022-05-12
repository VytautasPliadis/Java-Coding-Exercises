public class PrimitiveNumbers{
    public static void main(String[] args) {
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        int myTestIntNumber = 1_200_111;
        System.out.println("Integer minimum value: " + intMinValue);
        System.out.println("Integer maximum value: " + intMaxValue);
        System.out.println("Integer test value: " + myTestIntNumber);
        System.out.println("---------------------");

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + byteMinValue);
        System.out.println("Byte maximum value: " + byteMaxValue);
        System.out.println("---------------------");

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + shortMinValue);
        System.out.println("Short maximum value: " + shortMaxValue);
        System.out.println("---------------------");

        long myLongNumber = 3_147_483_647L; // when a number is longer than integer - L remover error
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("My long number: " + myLongNumber);
        System.out.println("Long minimum value: " + longMinValue);
        System.out.println("Long maximum value: " + longMaxValue);
        System.out.println("---------------------");
        }
    }
