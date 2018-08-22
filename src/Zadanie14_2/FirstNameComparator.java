package Zadanie14_2;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String firstName = p1.getFirstName();
        String firstName2 = p2.getFirstName();
        return firstName.compareTo(firstName2);
    }
}