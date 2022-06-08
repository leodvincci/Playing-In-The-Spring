package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {


    @Id
    String isbn;
    String title;
    String author;
    String publisher;
    int yearOfPublishing;

    public Book() {

    }

    public Book(String title, String author, String publisher, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
