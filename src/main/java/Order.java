import java.time.LocalDate;

public class Order {
    Book book;
    LocalDate dateOfOrder;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public String toString() {
        return "Order: /n" + "book: " + book + "/n dateOfOrder=" + dateOfOrder;
    }
}
