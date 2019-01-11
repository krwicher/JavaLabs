package edu.agh.cs.jtplab.lab6.lambda_expressions;

public class PersonComparisonProvider {
    public int compareByAge(Person a, Person b)
    {
        return a.getAge() - b.getAge();
    }
    public int compareByFirstName(Person a, Person b)
    {
        return a.getFirstName().compareTo(b.getFirstName());
    }
    public int compareByLastName(Person a, Person b)
    {
        return a.getLastName().length() - b.getLastName().length();
    }

}
