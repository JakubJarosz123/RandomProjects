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
        if (books.isEmpty()){
            System.out.println("No books available");
        }else {
            for (Book book : books){
                book.displayInfo();
            }
        }
    }

    public Book findBookById(int id){
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBookByTitle(String title){
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return books;
            }
        }
        return null;
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
