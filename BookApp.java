package be.intecbrussel;

import java.time.LocalDate;

public class BookApp {

    public static void main(String[] args) {

        Person author1 = new Person("Lindsay", "Ellis ", LocalDate.of(1984, 10, 24));
        Book book1 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author1);

        Person author2 = new Person("Lindsay", "Ellis ", LocalDate.of(1974, 10, 24));
        Book book2 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author2);

        Person author3 = new Person("Lindsay", "Ellis ", LocalDate.of(1964, 10, 24));
        Book book3 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author3);

        Person author4 = new Person("Lindsay", "Ellis ", LocalDate.of(1954, 10, 24));
        Book book4 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author4);

        Person author5 = new Person("Lindsay", "Ellis ", LocalDate.of(1944, 10, 24));
        Book book5 = new Book("Axiom's End", "SF", LocalDate.of(2020,07,21), author5);


        Book[] bookArray = new Book[]{book1, book2, book3, book4, book5};
        for (Book book : bookArray) {
            System.out.println(book);
        }

        Utilities.printYoungestWriter(bookArray);

    }
}
