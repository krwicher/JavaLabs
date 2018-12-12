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

    public static <T extends Number> Boolean isArithmetic(List<T> x) {
        if (x.size() > 2) {
            double r = x.get(1).doubleValue() - x.get(0).doubleValue();
            for (int i = 2; i < x.size(); i++) {
                double temp = x.get(i).doubleValue() - x.get(i - 1).doubleValue();
                if (temp != r) {
                    return false;
                }
            }

            return true;
        }
        return true;
    }

    public static <T extends Number> Boolean isGeometric(List<T> x) {
        if (x.size() > 2) {
            if (x.get(0).doubleValue() == 0 && x.get(1).doubleValue() > 0) {
                return false;
            }
            double q = x.get(1).doubleValue() / x.get(0).doubleValue();
            for (int i = 2; i < x.size(); i++) {
                double temp = x.get(i - 1).doubleValue() * q;
                if (temp != x.get(i).doubleValue()) {
                    return false;
                }
            }

            return true;
        }
        return true;
    }

    public static <T extends Number> double avgHarmonic(List<T> x) {
        if (x.size() > 0) {
            int lenght = x.size();
            double reversedSum = 0;
            for (int i = 0; i < lenght; i++) {
                reversedSum += 1 / x.get(i).doubleValue();
            }
            return (lenght / reversedSum);
        }

        return 0;
    }
    private final int numberOne = 1;
    private final int numberTwo = 2;
    private final int numberThree = 3;
    private final int numberFour = 4;
}
