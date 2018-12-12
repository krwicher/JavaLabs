package edu.agh.cs.jtplab.lab3.klasapomocnicza;

import java.util.List;

public class PhysicalConstants {
    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public int getNumberFour() {
        return numberFour;
    }

    public static <T extends Number> Boolean isArithmetic(List<T> array) {
        int size = array.size();
        if (size > 2) {
            double r = array.get(1).doubleValue() - array.get(0).doubleValue();
            for (int i = 2; i < size; i++) {
                double temp = array.get(i).doubleValue() - array.get(i - 1).doubleValue();
                if (temp != r)
                    return false;
            }
        }
        return true;
    }

    public static <T extends Number> Boolean isGeometric(List<T> array) {
        int size = array.size();
        if (size > 2) {
            if (array.get(0).doubleValue() == 0 && array.get(1).doubleValue() > 0) {
                return false;
            }
            double q = array.get(1).doubleValue() / array.get(0).doubleValue();
            for (int i = 2; i < size; i++) {
                double temp = array.get(i - 1).doubleValue() * q;
                if (temp != array.get(i).doubleValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T extends Number> double avgHarmonic(List<T> array) {
        int size = array.size();
        double reversedSum = 0;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                reversedSum += 1 / array.get(i).doubleValue();
            }
        }
        return reversedSum;
    }

    private final int numberOne = 1;
    private final int numberTwo = 2;
    private final int numberThree = 3;
    private final int numberFour = 4;
}
