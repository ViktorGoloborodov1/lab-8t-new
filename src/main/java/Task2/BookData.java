package Task2;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        if (reviews == 0) {
            return 0.0;
        }
        return total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double r1 = this.getRating();
        double r2 = other.getRating();

        // Книга з вищим рейтингом вважається "меншою", щоб іти першою при сортуванні
        if (r1 > r2) {
            return -1;
        }
        if (r1 < r2) {
            return 1;
        }

        // Якщо рейтинги рівні — порівнюємо за назвою за алфавітом
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" (" + author + ") — рейтинг: " + String.format("%.2f", getRating());
    }
}