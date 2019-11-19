package co.ga.bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    /**
     * Book entity to represent books in our data model. A book has a title.
     * We'll be able to search for books by title in {@link BookRepository}.
     *
     * @author Tracy
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;

    /**
     * The default constructor.
     */
    public Book() {
    }

    /**
     * Constructor with title as an argument
     * @param title the title for this book
     */
    public Book(String title) {
        this.title = title;
    }

    /**
     * Gets the ID
     * @return the auto-generated ID for this book
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID
     * @param id the ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}