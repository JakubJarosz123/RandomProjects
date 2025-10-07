package Library_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class LibrarySystem {
    private Library library;
    private List<User> users;

    public LibrarySystem() {
        library = new Library();
        users = new ArrayList<>();
    }

    public void addUser(int id, String name) {
        users.add(new User(id, name));
        System.out.println("User " + name + " added successfully");
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\n------------Welcome to Library System Menu------------");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Search Book By Title");
        System.out.println("4. Borrow Book By ID");
        System.out.println("5. Return Book");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter Book ID: ");
                int bookID = scanner.nextInt();
                System.out.println("Enter Book Title: ");
                String bookTitle = scanner.next();
                System.out.println("Enter Book Author: ");
                String bookAuthor = scanner.next();
                library.addBook(new Book(bookID, bookTitle, bookAuthor));
                break;

            case 2:
                library.viewBooks();
                break;

            case 3:
                System.out.println("Enter Book Title: ");
                String nameOfBook = scanner.next();
                List<Book> found = library.findBookByTitle(nameOfBook);
                if (found.isEmpty()){
                    System.out.println("No books found!");
                }else {
                    for (Book book : found) {
                        book.displayInfo();
                    }
                }
                break;

            case 4:
                System.out.println("Enter Book ID: ");
                int BorrowBookID = scanner.nextInt();
                Book bookId = library.findBookById(BorrowBookID);
                if (bookId != null){
                    library.borrowBookById(bookId.getId());
                }else {
                    System.out.println("Wrong Book ID!");
                }
                break;

            case 5:
                System.out.println("Enter Book ID: ");
                int returnBookID = scanner.nextInt();
                Book returnBook = library.findBookById(returnBookID);
                if (returnBook != null){
                    library.returnBook(returnBookID);
                    System.out.println("Book has been returned successfully!");
                }else {
                    System.out.println("Wrong Book ID!");
                }
                break;

            case 6:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Wrong choice!");
        }
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.menu();
    }
}
