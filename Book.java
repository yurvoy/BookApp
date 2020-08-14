package be.intecbrussel;

import java.time.LocalDate;

public class Book {

    String title;
    String genre;
    private LocalDate releaseDate;
    Person author;

    public Book(String title, String genre, LocalDate releaseDate, Person author) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Person getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", author=" + author +
                '}';
    }
}
