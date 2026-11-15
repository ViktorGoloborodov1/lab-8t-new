package Task5;

public class Main {

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {
        if (array == null || element == null) {
            return false;
        }
        for (T item : array) {
            if (item != null && item.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Приклад 1: пошук у масиві рядків (String реалізує Comparable<String>)
        String[] cities = {"Одеса", "Київ", "Львів", "Харків"};
        System.out.println("Є Львів: " + contains(cities, "Львів"));     // true
        System.out.println("Є Дніпро: " + contains(cities, "Дніпро"));   // false

        // Приклад 2: пошук у масиві цілих чисел (Integer реалізує Comparable<Integer>)
        Integer[] codes = {101, 202, 303, 404};
        System.out.println("Є 404: " + contains(codes, 404));            // true
        System.out.println("Є 500: " + contains(codes, 500));            // false
    }
}