import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    Set<String> set = new HashSet<>();

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        set.addAll(List.of(surname.split("\\P{IsAlphabetic}+")));

    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        set.addAll(List.of(surname.split("\\P{IsAlphabetic}+")));
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + " возраст: " + age + " - " + "количество слов в фамилии: " + set.size();
    }
}
