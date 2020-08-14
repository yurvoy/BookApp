package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utilities {

//    public static void printYoungestWriter(Book[] books ){
//        int youngestIndex = 0;
//        for (int i = 1; i < books.length; i++) {
//            if(books[i].getAuthor().getDateOfBirth().isAfter(books[i-1].getAuthor().getDateOfBirth())){
//                youngestIndex = i;
//            }
//        }
//        System.out.println(books[youngestIndex]);
//    }

    public static void printYoungestWriter(Book[] books ){
        List<Person> authors = new ArrayList<>();
        for (Book book : books) {
            authors.add(book.author);
        }
        Person youngest =  authors.stream()
                .max(Comparator.comparing(Person::getDateOfBirth))
                .get();
        System.out.println("Youngest Author : " + youngest);
    }


}
