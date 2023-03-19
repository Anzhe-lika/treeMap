import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Семён", "Алексеев", 10));
        people.add(new Person("Надежда", "Владимирова", 17));
        people.add(new Person("Николай", "Корнейчуков", 45));
        people.add(new Person("Анна", "Горенко", 25));
        people.add(new Person("Гийас", "ад-Дин Абу-ль-Фатх Омар ибн Ибрахим", 99));

        Collections.sort(people, new PersonComparat(3));
        System.out.println(people);

        people.removeIf(person -> person.getAge() < 18 );
        System.out.println(people);

    }
}