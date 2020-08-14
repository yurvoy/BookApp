package be.intecbrussel;

import java.time.LocalDate;

public class BookApp {

    public static void main(String[] args) {

        Person author1 = new Person("Lindsay", "Ellis", LocalDate.of(1984, 10, 24));
        Book book1 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author1);

        Person author2 = new Person("Lindsay", "Ellis", LocalDate.of(1974, 10, 24));
        Book book2 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author2);

        Person author3 = new Person("Stephen", "King", LocalDate.of(1944, 90, 21));
        Book book3 = new Book("The Shining", "SF", LocalDate.of(1980,07,01), author3);
        Book book4 = new Book("The Stand", "SF", LocalDate.of(1990,05,01), author3);
        Book book5 = new Book("Carrie", "SF", LocalDate.of(2005,10,01), author3);


        Book[] bookArray = new Book[]{book1, book2, book3, book4, book5};
        for (Book book : bookArray) {
            System.out.println(book);
        }

        Utilities.printYoungestWriter(bookArray);

    }
}
