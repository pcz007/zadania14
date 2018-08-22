package Zadanie14_2;

import java.util.Comparator;

public enum SortOptions {

    IMIE_ROSNACO(new FirstNameComparator()),
    IMIE_MALEJACO(new FirstNameComparatorReversed()),
    NAZWISKO_ROSNACO(new LastNameComparator()),
    NAZWISKO_MALEJACO(new LastNameComparatorReversed());

    private final Comparator<Person> comparator;

    SortOptions(Comparator<Person> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Person> getComparator() {
        return comparator;
    }
}
