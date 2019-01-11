package edu.agh.cs.jtplab.lab6.lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo world");

        List<Person> persons = Arrays.asList(new Person("krzys","wicher", 13),
                new Person("kurys2","wicherr", 22),
                new Person("iloys3","wicherrrrr", 15),
                new Person("ilsys4","wicherrrski", 16),
                new Person("krzys5","wicheski", 11));

        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getLastName().length() - o2.getLastName().length();
            }
        });
        PersonComparisonProvider compProvider = new PersonComparisonProvider();
        Collections.sort(persons, (a, b) -> compProvider.compareByAge(a,b));
        //persons.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
        System.out.println("w jednej linii imiona: " + persons.stream().map(a -> a.getFirstName()).collect(Collectors.joining(" ")));
        //System.out.println(persons.stream().filter(a -> a.getFirstName().matches("krzys.*")).count());
        System.out.println("suma wieku: " + persons.stream().mapToInt(p -> p.getAge()).sum());
        List<Person> test1 = persons.stream().filter(p -> p.getLastName().endsWith("ski")).collect(Collectors.toList());
        test1.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
        System.out.println("max: " + Collections.max(persons, (a,b) -> compProvider.compareByLastName(a,b)).getLastName());
    }
}
