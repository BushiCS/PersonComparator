import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private final int maxSurnameWords;

    public PersonComparator(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] Arr1 = o1.getSurname().split("\\P{IsAlphabetic}+"); // Здесь вместо массива я мог бы обратиться к коллекции из Person, но тогда бы был к ней привязан и терялась бы самостоятельность компаратора
        String[] Arr2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (Arr1.length >= maxSurnameWords && Arr2.length >= maxSurnameWords) { // если кол-во слов в фамилии больше или равно максимальному
            return Integer.compare(o1.getAge(), o2.getAge()); // если больше или равно, то просто считает по возрасту
        }
        if (Arr1.length > Arr2.length) {
            return 1;
        } else if (Arr1.length < Arr2.length) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
