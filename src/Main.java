import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int MAX_WORDS = 3;
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack", "Black White Yellow Blue Pink Green", 52));
        list.add(new Person("Edwin", "van der Sar Ras der", 51));
        list.add(new Person("Stevland", "Hardaway Morris Daniels", 72));
        list.add(new Person("Wayne", "Rooney", 36));
        list.add(new Person("Cristiano", "Ronaldo De Souza", 38));
        list.add(new Person("Lionel", "Messi Maradona", 35));
        list.add(new Person("Lilly", "Mai Robertson Gregory House", 42));
        list.add(new Person("Mohammed", "May", 25));
        list.add(new Person("Alba", "Nichols", 27));
        list.add(new Person("Summer", "Rose Livingston", 22));
        list.add(new Person("Neymar", "Da Silva Santos Junior", 30));

        list.sort((o1, o2) -> {
            String[] surnameArray1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surnameArray2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            if (surnameArray1.length >= MAX_WORDS && surnameArray2.length >= MAX_WORDS) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (surnameArray1.length > surnameArray2.length) {
                return 1;
            } else if (surnameArray1.length < surnameArray2.length) {
                return -1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(list);
    }
}
