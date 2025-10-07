package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()){
            book.borrow();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else{
            System.out.println(book.getTitle() + " not available");
        }
    }

    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        }else {
            System.out.println(name + " does not have this book");
        }
    }

    public void viewBorrowedBooks(){
        System.out.println(name + "'s borrowed books:");
        if (borrowedBooks.isEmpty()){
            System.out.println("No books borrowed");
        }else {
            for (Book book : borrowedBooks){
            System.out.println(book.displayInfo());
            }
        }
    }
}
