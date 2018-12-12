package edu.agh.cs.jtplab.lab3.prosty_interfejs;

import java.util.List;

public class EuklidesDistance  implements Distance {

    public <T extends Number> double distance(List<T> p1, List<T> p2) throws DistanceException {
        if (p1.size() != p2.size()) {
            throw new DistanceException("Your lists don't have the same size");
        } else {
            double result = 0.0D;

            for(int i = 0; i < p2.size(); ++i) {
                double temp = ((Number)p2.get(i)).doubleValue() - ((Number)p1.get(i)).doubleValue();
                temp *= temp;
                result += temp;
            }

            return Math.sqrt(result);
        }
    }
}
