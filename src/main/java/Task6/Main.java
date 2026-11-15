package Task6;

public class Main {

    // Приклад методу, що повертає два значення одночасно (назва товару та його ціна)
    public static GenericTwoTuple<String, Double> getProductPrice() {
        String title = "Клавіатура механічна";
        double price = 2450.0;
        return new GenericTwoTuple<>(title, price);
    }

    // Приклад методу, що повертає три значення (ПІБ студента, група та середній бал)
    public static GenericThreeTuple<String, String, Integer> getStudentSummary() {
        return new GenericThreeTuple<>("Іванов Іван", "КН-21", 92);
    }

    public static void main(String[] args) {
        // 1. Перевірка GenericTwoTuple
        GenericTwoTuple<String, Double> product = getProductPrice();
        System.out.println("TwoTuple: " + product);
        System.out.println("Товар: " + product.first + ", ціна: " + product.second + " грн");

        // 2. Перевірка GenericThreeTuple
        GenericThreeTuple<String, String, Integer> student = getStudentSummary();
        System.out.println("\nThreeTuple: " + student);
        System.out.println("Студент: " + student.getFirst() +
                ", група: " + student.getSecond() +
                ", бал: " + student.three);
    }
}