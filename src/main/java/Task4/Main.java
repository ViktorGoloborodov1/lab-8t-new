package Task4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] input, Predicate<T> p) {
        T[] result = (T[]) new Object[input.length];

        int counter = 0;
        for (T item : input) {
            if (p.test(item)) {
                result[counter] = item;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        // Приклад 1: фільтрація масиву рядків
        String[] words = {"Java", "Python", "C++", "Kotlin", "Go", "JavaScript"};
        Object[] longWords = filter(words, s -> s.length() >= 4);
        System.out.println("Мови з назвою від 4 символів: " + Arrays.toString(longWords));

        // Приклад 2: фільтрація масиву цілих чисел
        Integer[] numbers = {3, 8, 12, 15, 20, 27, 30};
        Object[] evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("Парні числа: " + Arrays.toString(evenNumbers));
    }
}