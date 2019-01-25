package edu.agh.cs.jtplab.egz;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo world");
        List<String> list = Arrays.asList("Sdfds", "sdfsd");
//        Dana jest niepusta lista List<String> list. W jaki sposób można wyświetlić na wyjściu
//        standardowym długości poszczególnych łańcuchów znaków z tej listy.
        System.out.println(list.stream().map(s -> s.length()).collect(Collectors.toList()));
        //list.forEach(System.out::println(s -> s.size()));
        //list.forEach(s -> System.out.println(s.length));
        for (String s : list) System.out.println(s.length());
        //for(String s : list) System.out.println(s.length);

        String str = 'a' + "a";
        long bigNumber = 10_000___0_0_0;
        //int hexVal = 0x01ffa g0h;
        //float d2 = 1.234e2;
        char c = 'A' + 1;

//        Zadanie 2 (5p) Zmienna map wskazuje obiekt klasy implementującej interfejs Map<String, Integer>. W jaki
//        sposób można wyświetlić na wyjściu standardowym wszystkie pary klucz-wartość?
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        //map.println(map->map.forEach(System.out::println));
        //for(Entry<String, Integer> entry : map.entrySet()) System.out.println(entry);
        map.entrySet().forEach(System.out::println);
        //map.stream().forEach(System.out::println);
//      Zadanie 3 (5p) Zaznacz przypadki inicjalizacji, dla których wystapi błąd kompilacji.
        int a = 0b10101;
        //long bigNumber = 10_000__0_0_0_;
        //int d = 10101b;
        double d2 = 1.234e2;
        String str2 = "ala".substring(1);

//        Zadanie 2 (5p) Zmienna set wskazuje obiekt klasy implementującej interfejs Set<Integer>. W jaki sposób
//        można wyświetlić na wyjściu standardowym wszystkie elementy parzyste?
        Set<Integer> set = new HashSet<>();
        for (int i : set) if ((i & 1) == 0) System.out.println(i);
        set.stream().filter(e -> {
            return e % 2 == 0;
        }).forEach(System.out::println);
        //set.stream().filter(e -> { return (e & 1) == 0; }).forEach(System.out:println(e));
        for (int i : set) if ((i & 1) != 0) System.out.println(i);
        set.forEach(e -> {
            if (e % 2 == 0) System.out.println(e);
        });
//      Zadanie 3 (5p) Zaznacz przypadki inicjalizacji, dla których wystapi błąd kompilacji.
        long k = 10000000000L;
        //float f = 3.14;
        int[] a2 = new int[]{1, 2};
        //boolean flag = (boolean)0;
        String str3 = "krakow".substring(1, 3);
//      Zadanie 2 (5p) Zmienna set wskazuje obiekt klasy implementującej interfejs Set<Integer>. W jaki sposób
//      można wyświetlić na wyjściu standardowym wszystkie elementy nieparzyste?
        for (int i : set) if ((i & 1) == 1) System.out.println(i);
        set.stream().filter(e -> {
            return e % 2 != 0;
        }).forEach(System.out::println);
        //set.stream().filter(e -> { return (e & 1) == 1; }).forEach(System.out:println(e));
        for (int i : set) if ((i & 1) != 0) System.out.println(i);
        set.forEach(e -> {
            if (e % 2 == 0) System.out.println(e);
        });
//        Zadanie 3 (5p) Zaznacz przypadki inicjalizacji, dla których wystapi błąd kompilacji.
        float ff = .3f;
        //char cc = '=' + 5L;
        //float[] array = new float[] {1.0, 2.0};
        int n = (int) 1.14;

        double[][] matrix = new double[4][4];
    }
}