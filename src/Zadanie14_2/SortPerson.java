package Zadanie14_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortPerson {

    public static void main(String[] args) {

        boolean isCorrect = false;

        ArrayList<Person> osoby = new ArrayList<>();
        osoby.add(new Person("Adam", "Zamkowy"));
        osoby.add(new Person("Zygmunt", "Tomczak"));
        osoby.add(new Person("Radosław", "Bielecki"));
        osoby.add(new Person("Bartosz", "Radosny"));
        osoby.add(new Person("Wojciech", "Adamski"));

        System.out.println("Lista osób:");
        for (Person osob : osoby) {
            System.out.println(osob.toString());
        }
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz sposób sortowania:");
        for (SortOptions sortOptions : SortOptions.values()) {
            System.out.print(sortOptions + ", ");
        }
        System.out.println("");

        do {
            try {
                String userInput = scan.nextLine();
                SortOptions sortOptions = SortOptions.valueOf(userInput.toUpperCase());
                Comparator<Person> comparator = sortOptions.getComparator();
                Collections.sort(osoby, comparator);
                isCorrect = true;
            } catch (IllegalArgumentException ex) {
                System.err.println("Podano niepoprawną opcję!");
                System.err.println("Spróbuj jeszcze raz");
            }
        } while (!isCorrect);

        System.out.println("");

        for (Person osob : osoby) {
            System.out.println(osob.toString());
        }

    }
}
