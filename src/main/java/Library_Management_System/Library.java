package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks(Book displayInfo){
        for (Book book : books) {
            System.out.println(book.displyInfo());
        }
    }

    public void findBookById(Book id){
        if (books.contains(id)){
            System.out.println("Book ID: " + id);
        }else {
            System.out.println("Book ID not found");
        }
    }

    public void findBookByTitle(String title){
        if (books.contains(title)){
            System.out.println("Book Title: " + title);
        }
    }

    public void borrowBookById(int bookID) {
        for (Book book : books) {
            if (book.getId() == bookID) {
                if (book.isAvailable()) {
                    book.borrow();
                    System.out.println("Book has " + book.getTitle() + "been borrowed");
                } else {
                    System.out.println("Book" + book.getTitle() + " has been borrowed");
                }
                return;
            }
        }
    }

    public void returnBook(int bookID){
        for (Book book : books) {
            if (book.getId() == bookID) {
                if (book.isAvailable()) {
                    book.returnBook();
                }
            }else  {
                System.out.println("Book" + book.getTitle() + " has been returned");
            }
        }
        return;
    }
}
