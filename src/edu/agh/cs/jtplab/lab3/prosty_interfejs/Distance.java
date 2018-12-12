package edu.agh.cs.jtplab.lab3.prosty_interfejs;

import java.util.List;

interface Distance {
    <T extends Number> double distance(List<T> var1, List<T> var2) throws DistanceException;
}
