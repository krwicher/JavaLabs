package edu.agh.cs.jtplab.lab3.interfejs_map;

import edu.agh.cs.jtplab.lab3.czestosc_wystepowania_slow.HistogramData;
import edu.agh.cs.jtplab.lab3.czestosc_wystepowania_slow.HistogramPoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\krzys_i_lidzia\\Documents\\58451-0.txt");
        try {
            Scanner sc = new Scanner(file);
            HistogramData data = new HistogramData();
            while (sc.hasNext())
                data.addEntry(sc.next());
            Collection<HistogramPoint> list = data.getDataPoints();
            List<String> result = new ArrayList<String>();
            while(result.size() < 50)
            {
                String max = data.getMaxValue();
                result.add(max);
                data.removeEntry(max);
            }
            for (String entry : result
                 ) {
                System.out.println(entry);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
