package edu.agh.cs.jtplab.lab3.czestosc_wystepowania_slow;

import java.util.Collection;
import java.util.Map;

public class HistogramData {
    private Map<String, HistogramPoint> points;

    public HistogramData() {

    }

    public Collection<HistogramPoint> getDataPoints() {
        return points.values();
    }

    public void addEntry(String key) {
        if (!points.containsKey(key)) {
            points.put(key, new HistogramPoint(key));
        }
        points.get(key).add();
    }

    public String getMaxValue() {
        String maxValueKey = "";
        int maxValue = 0;
        for (Map.Entry<String, HistogramPoint> entry : points.entrySet()) {
            if (maxValueKey.equals("")) {
                maxValueKey = entry.getKey();
                maxValue = entry.getValue().getCount();
            }
            if (maxValue < entry.getValue().getCount()) {
                maxValueKey = entry.getKey();
                maxValue = entry.getValue().getCount();
            }
        }
        return maxValueKey;
    }
}
