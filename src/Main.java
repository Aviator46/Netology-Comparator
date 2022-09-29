import PersonInformation.Person;
import PersonInformation.PersonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> notablePeoples = new ArrayList<>();
        notablePeoples.add(new Person("Саша", "Гололобов", 50));
        notablePeoples.add(new Person("Рома", "Сухов", 42));
        notablePeoples.add(new Person("Аня", "Илькина Медведева", 15));
        notablePeoples.add(new Person("Саша", "Батько", 35));
        notablePeoples.add(new Person("Оля", "Кузьмина", 12));

        notablePeoples.removeIf(a -> a.getAge() < 18);
        System.out.println(notablePeoples);
    }
}