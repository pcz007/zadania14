package Zadanie14_2;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName);
    }

    @Override
    public int compareTo(Person p) {
//        if (this.name.compareTo(p.name) > 0)
//            return 1;
//        else if (this.name.compareTo(p.name) < 0)
//            return -1;
//        return 0;
        return this.firstName.compareTo(p.firstName);
    }
}
