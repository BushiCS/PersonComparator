import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private final int maxSurnameWords;

    public PersonComparator(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameArray1 = o1.getSurname().split("\\P{IsAlphabetic}+"); // Здесь вместо массива я мог бы обратиться к коллекции из Person, но тогда бы был к ней привязан и терялась бы самостоятельность компаратора
        String[] surnameArray2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (surnameArray1.length >= maxSurnameWords && surnameArray2.length >= maxSurnameWords) { // если кол-во слов в фамилии больше или равно максимальному
            return Integer.compare(o1.getAge(), o2.getAge()); // если больше или равно, то просто считает по возрасту
        }
        if (surnameArray1.length > surnameArray2.length) {
            return 1;
        } else if (surnameArray1.length < surnameArray2.length) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
