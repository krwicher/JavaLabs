package edu.agh.cs.jtplab.kol4.zad11;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo world");

        Map<String,String> persons = new HashMap<String, String>();
        persons.put("50032984755","Lozano");
        persons.put("85060911185","Gambini");
        persons.put("85052985549","Rutzmoser");
        persons.put("85031728278","Broca");
        persons.put("03221898894","Pearsall");
        persons.put("76100376815","Jardine");
        persons.put("97063025121","Schomp");
        persons.put("49061824864","Snelbecker");
        persons.put("78102156787","Nisen");
        persons.put("49042093667","Shrouf");
        //Map<String,String> persons85 = persons.entrySet().stream().filter(x -> x.getKey().matches("85.*")).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));



        System.out.println( Collections.min( persons.entrySet().stream()
                .filter(x -> x.getKey().matches("85.*")).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()))
                .values(),(x, y) -> x.compareTo(y) ));

    }
}
