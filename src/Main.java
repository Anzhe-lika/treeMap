import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Семён", "Алексеев", 10));
        people.add(new Person("Надежда", "Владимирова", 21));
        people.add(new Person("Николай", "Корнейчуков", 45));
        people.add(new Person("Анна", "Горенко", 25));
        people.add(new Person("Гийас", "ад-Дин Абу-ль-Фатх Омар ибн Ибрахим", 99));
        System.out.println(people);
        Collections.sort(people, new PersonComparat(3));
        System.out.println("Список людей в порядке знатности:\n" + people);
    }
}