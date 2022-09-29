import PersonInformation.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> notablePeoples = new ArrayList<>();
        notablePeoples.add(new Person("Саша", "Гололобов", 50));
        notablePeoples.add(new Person("Рома", "Сухов", 42));
        notablePeoples.add(new Person("Аня", "Илькина Медведева", 20));
        notablePeoples.add(new Person("Саша", "Батько", 35));
        notablePeoples.add(new Person("Оля", "Кузьмина", 47));

        Collections.sort(notablePeoples, (a, b) -> {
                    int lengthSurNameFirstPerson = a.getSurname().split("\\W").length;
                    int lengthSurNameSecondPerson = b.getSurname().split("\\W").length;
                    int lenght = lengthSurNameSecondPerson - lengthSurNameFirstPerson;
                    if ((lengthSurNameFirstPerson >= 3 && lengthSurNameSecondPerson >= 3) || lenght == 0) {
                        return b.getAge() - a.getAge();
                    } else {
                        return lenght;
                    }
                }
        );
        System.out.println(notablePeoples);
    }
}