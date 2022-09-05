import java.util.ArrayList;
import java.util.List;
public class Main {
    private static final int MAX_AGE = 18;
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack", "Black White Yellow Blue Pink Green", 52));
        list.add(new Person("Edwin", "van der Sar Ras der", 51));
        list.add(new Person("Stevland", "Hardaway Morris Daniels", 72));
        list.add(new Person("Wayne","Rooney", 36));
        list.add(new Person("Cristiano","Ronaldo De Souza", 38));
        list.add(new Person("Bill","Gates le Pascal", 13));
        list.add(new Person("Lionel","Messi Maradona",35));
        list.add(new Person("Lilly","Mai Robertson Gregory House", 42));
        list.add(new Person("Mohammed", "May", 25));
        list.add(new Person("Alba","Nichols",27));
        list.add(new Person("Michael","Prascovia Elikolani Valiente", 10));
        list.add(new Person("Summer","Rose Livingston", 22));
        list.add(new Person("Neymar", "Da Silva Santos Junior", 30));
        list.add(new Person("Carl","Johnson von Windows", 15));
        list.sort(new PersonComparator(3));
        list.removeIf(person -> person.getAge() < MAX_AGE);
        System.out.println(list);
    }
}
