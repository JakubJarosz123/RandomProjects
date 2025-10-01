package Small_DB_Books;

public class Book {
    private String title;
    private String author;
    private int yearOfRelease;

    public Book(String title, String author, int yearOfRelease) {
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book: [\n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Year Of Release: " + yearOfRelease + ']';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
