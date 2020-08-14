package be.intecbrussel;


import java.util.*;
import java.util.stream.Stream;

public class Utilities {

    public static Book getNewestBook(Book[] books) {
        return Stream.of(books)
                .max(Comparator.comparing(Book::getReleaseDate))
                .get();
    }

    public static void printSortedByTitle(Book[] books) {
        Stream.of(books)
                .sorted((o1, o2)->o1.getTitle().compareTo(o2.getTitle()))
                .forEach(System.out::println);
    }

//    public static void printYoungestWriter(Book[] books ){
//        int youngestIndex = 0;
//        for (int i = 1; i < books.length; i++) {
//            if(books[i].getAuthor().getDateOfBirth().isAfter(books[i-1].getAuthor().getDateOfBirth())){
//                youngestIndex = i;
//            }
//        }
//        System.out.println(books[youngestIndex]);
//    }

    public static void printYoungestWriter(Book[] books) {
        List<Person> authors = new ArrayList<>();
        for (Book book : books) {
            authors.add(book.author);
        }
        Person youngest = authors.stream()
                .max(Comparator.comparing(Person::getDateOfBirth))
                .get();
        System.out.println(youngest);
    }


    public static void printBooksReleasedIn2016(Book[] books) {
        Stream.of(books)
                .filter(e -> e.getReleaseDate().getYear() == 2016)
                .forEach(System.out::println);
    }

}
