package com.tts;

public class MagicCalculator extends Calculator {

    public static double sRoot(double num1) {
        double sqroot = Math.sqrt(num1);
        return sqroot;
    }

    public static double sin(double num1) {
        double sinValue = Math.sin(num1);
        return sinValue;
    }

    public static double cos(double num1) {
        double cosValue = Math.cos(num1);
        return cosValue;
    }

    public static double tan(double num1) {
        double tanValue = Math.tan(num1);
        return tanValue;
    }

    public static int factorial(int num1) {
        int factValue = 1;
        for (int i = 1; i <= num1; i++) {
            factValue = factValue * i;
        }
        return factValue;
    }
}

