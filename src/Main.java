import PersonInformation.Person;
import PersonInformation.PersonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Person> notablePeoples = new ArrayList<>();
        notablePeoples.add(new Person("Саша", "Гололобов", 50));
        notablePeoples.add(new Person("Рома", "Сухов", 42));
        notablePeoples.add(new Person("Аня", "Илькина Медведева", 20));
        notablePeoples.add(new Person("Саша", "Батько", 35));
        notablePeoples.add(new Person("Оля", "Кузьмина", 47));

        Collections.sort(notablePeoples, new PersonComparator(3));
        System.out.println(notablePeoples);
    }
}