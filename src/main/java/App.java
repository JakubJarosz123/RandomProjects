import java.util.*;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Unfinished Tales","Tolkien", 2005);
        Book book2 = new Book("The Lord Of The Rings: The Fellowship Of The Ring","Tolkien", 2000);
        Book book3 = new Book("The Lord Of The Rings: The Two Towers ","Tolkien", 2002);
        Book book4 = new Book("The Lord Of The Rings: the Return Of The King","Tolkien", 2009);
        Book book5 = new Book("The Silmarillion","Tolkien", 2006);

        Order order1 = new Order(book1,2017,05,22);
        Order order2 = new Order(book2,2020,01,19);
        Order order3 = new Order(book3,2019,05,20);
        Order order4 = new Order(book4,2021,07,01);
        Order order5 = new Order(book5,2016,11,13);

        Deque<Order> orders = new ArrayDeque<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        for (Order order : orders) {
            if(order.getDateOfOrder().getYear() >= 2020) {
                System.out.println(order);
            }
        }



    }
}
