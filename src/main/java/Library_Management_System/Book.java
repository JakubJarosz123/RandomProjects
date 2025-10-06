package Library_Management_System;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String displyInfo(){
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + available);
        return "";
    }

    public boolean borrow() {
        if (available) {
            this.available = false;
        } else  {
            System.out.println("This Book has been borrowed.");
        }
        return true;
    }

    public boolean returnBook() {
        if (available == false) {
            this.available = true;
        } else {
            System.out.println("Warning this Book has been returned!");
        }
        return true;
    }
}