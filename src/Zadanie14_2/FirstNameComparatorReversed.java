package Zadanie14_2;

import java.util.Comparator;

public class FirstNameComparatorReversed implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return (p1.getFirstName().compareTo(p2.getFirstName())) * -1;
    }
}
