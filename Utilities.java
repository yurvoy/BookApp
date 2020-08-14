package be.intecbrussel;

public class Utilities {

    public static void printYoungestWriter(Book[] books ){
        int youngestIndex = 0;
        for (int i = 1; i < books.length; i++) {
            if(books[i].getAuthor().getDateOfBirth().isAfter(books[i-1].getAuthor().getDateOfBirth())){
                youngestIndex = i;
            }
        }
        System.out.println(books[youngestIndex]);
    }
}
