package Small_DB_Books;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDatabase {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n =====Book Database=====");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addBook();
                case "2" -> showAllBooks();
                case "3" -> searchByTitle();
                case "4" -> {
                    running = false;
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid option, try again.");
            }
        }
    }
    private static void addBook() {
        System.out.println("Enter title of book: ");
        String title = scanner.nextLine();

        System.out.println("Enter author of book: ");
        String author = scanner.nextLine();

        System.out.println("Enter year of release: ");
        int yearOfRelease = scanner.nextInt();

        books.add(new Book(title, author, yearOfRelease));
        System.out.println("Book added successfully!");
    }


    private static void showAllBooks () {
        if (books.isEmpty()) {
            System.out.println("There are no books in the database");
            return;
        }

        System.out.println("\n All Books");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void searchByTitle () {
        System.out.println("Enter title of book: ");
        String searchTitle = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Title not found");
        }
    }
}

