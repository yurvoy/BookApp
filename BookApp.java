package be.intecbrussel;

import java.time.LocalDate;

public class BookApp {

    public static void main(String[] args) {

        System.out.println("LIBRARY");
        Person author1 = new Person("Lindsay", "Ellis", LocalDate.of(1984, 11, 24));
        Book book1 = new Book("Axiom's End", "SF", LocalDate.of(2020,7,21), author1);

        Person author2 = new Person("Junot", "Diaz", LocalDate.of(1968, 12, 31));
        Book book2 = new Book("The Best American Short Stories", "Short Stories", LocalDate.of(2016,10,4), author2);

        Person author3 = new Person("Stephen", "King", LocalDate.of(1944,9, 21));
        Book book3 = new Book("The Shining", "SF", LocalDate.of(1980,7,1), author3);
        Book book4 = new Book("The Stand", "SF", LocalDate.of(1990,5,1), author3);
        Book book5 = new Book("Carrie", "SF", LocalDate.of(2005,10,1), author3);

        Book[] bookArray = new Book[]{book1, book2, book3, book4, book5};
        for (Book book : bookArray) {
            System.out.println(book);
        }


        System.out.println("\nNEWEST BOOK");
        System.out.println(Utilities.getNewestBook(bookArray));
        System.out.println("\nSORTED TITLE LIST");
        Utilities.printSortedByTitle(bookArray);
        System.out.println("\nYOUNGEST AUTHOR");
        Utilities.printYoungestWriter(bookArray);
        System.out.println("\nRELEASED IN 2016");
        Utilities.printBooksReleasedIn2016(bookArray);


    }
}
