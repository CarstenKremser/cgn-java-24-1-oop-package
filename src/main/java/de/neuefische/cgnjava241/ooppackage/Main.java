package de.neuefische.cgnjava241.ooppackage;

public class Main {
    public static void main(String[] args) {

        Book[] myBooks = new Book[]{
                new Book("Programmieren mit der Maus","Philip Kiefer","978-3-8421-0975-9"),
                new Book("Looking good in Print","Roger C. Parker","3-907020-57-X"),
                new Book("Rebel without a crew","Robert Rodriguez","978-0-452-27187-6"),
        };
        Library myLibrary = new Library(myBooks);
        System.out.println(myLibrary);

        // add a new Book
        Book myNewBook = new Book("Gerthsen Physik","Dieter Meschede","3-540-42024-X");
        myLibrary.addBook(myNewBook);
        System.out.println("Added Book");
        System.out.println(myLibrary);

        // Remove Book "Looking good in Print"
        myLibrary.removeBookAtIndex(1);
        System.out.println("Removed Book");
        System.out.println(myLibrary);
    }
}