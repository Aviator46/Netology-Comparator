package PersonInformation;
import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int lengthSurNameFirstPerson = o1.getSurname().split("\\W").length;
        int lengthSurNameSecondPerson = o2.getSurname().split("\\W").length;
        if (lengthSurNameFirstPerson == lengthSurNameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return lengthSurNameFirstPerson > lengthSurNameSecondPerson ? 1 : -1;
    }
}