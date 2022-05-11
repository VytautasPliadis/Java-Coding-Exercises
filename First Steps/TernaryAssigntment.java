package com.vytautas;

public class Main{
    public static void main(String[] args) {
        double newNumberOne = 20.00d;
        double newNumberTwo = 80.00d;

        double sumOfOneTwo = (newNumberOne + newNumberTwo) *100.00d;
        System.out.println(sumOfOneTwo);

        double remainderOne = sumOfOneTwo % 30.00d;
        //System.out.println(remainderOne);

        boolean remainderResult = remainderOne == 0 ? true : false;
        //System.out.println("Remainder = " + remainderResult);
        if (!remainderResult){
            System.out.println("Got some remainder: " + remainderOne);
        }
    }
}
