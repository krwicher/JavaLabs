package edu.agh.cs.jtplab.lab3.czestosc_wystepowania_slow;

public class HistogramPoint {
    private int count;
    private String data;

    HistogramPoint(String label) {
        data = label;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void add() {
        this.count++;
    }
}
